package com.negreiros.stefaninitest.data.repository

import android.util.Log
import com.negreiros.stefaninitest.data.model.Image
import com.negreiros.stefaninitest.data.repository.datasource.ImageCacheDataSource
import com.negreiros.stefaninitest.data.repository.datasource.ImageRemoteDataSource
import com.negreiros.stefaninitest.domain.ImageRepository
import java.lang.Exception

class ImageRepositoryImpl(
    private val imageRemoteDataSource: ImageRemoteDataSource,
    private val imageCacheDataSource: ImageCacheDataSource
) : ImageRepository {
    override suspend fun getImages(): List<Image>? = getImagesFromCache()

    private suspend fun getImagesFromAPI(): List<Image> {
        val imageList: MutableList<Image> = mutableListOf()
        try {
            val response = imageRemoteDataSource.getImages()
            val body = response.body()
            body?.data?.forEach { image ->
                image.let {
                    if (!it.images.isNullOrEmpty() && "image/jpeg" == it.images[0].type)
                        imageList.add(it.images[0])
                }
            }
        } catch (exception: Exception) {
            Log.i("Error", exception.message.toString())
        }
        return imageList
    }

    private suspend fun getImagesFromCache(): List<Image> {
        lateinit var imageList: List<Image>
        try {
            imageList = imageCacheDataSource.getImagesFromCache()
        } catch (e: Exception) {
            Log.i("CACHE-ERROR", e.message.toString())
        }
        if (imageList.isEmpty()) {
            imageList = getImagesFromAPI()
            imageCacheDataSource.saveImagesToCache(imageList)
        }
        return imageList
    }
}
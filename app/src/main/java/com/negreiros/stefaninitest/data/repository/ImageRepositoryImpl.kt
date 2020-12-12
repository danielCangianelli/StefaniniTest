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
        lateinit var imageList: List<Image>
        try {
            val response = imageRemoteDataSource.getImages()
            val body = response.body()
            if (body != null) {
                imageList = body.data[0].images
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
        if(imageList.isEmpty()){
            imageList =  getImagesFromAPI()
            imageCacheDataSource.saveImagesToCache(imageList)
        }
        return imageList
    }
}
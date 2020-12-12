package com.negreiros.stefaninitest.data.repository.datasource

import com.negreiros.stefaninitest.data.model.Image

interface ImageCacheDataSource {
    suspend fun saveImagesToCache(images: List<Image>)

    suspend fun getImagesFromCache(): List<Image>
}
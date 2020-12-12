package com.negreiros.stefaninitest.data.repository.datasource

import com.negreiros.stefaninitest.data.model.ImageList
import retrofit2.Response

interface ImageRemoteDataSource {
    suspend fun getImages(): Response<ImageList>
}
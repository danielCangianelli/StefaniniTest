package com.negreiros.stefaninitest.data.repository.datasourceImpl

import com.negreiros.stefaninitest.data.api.ApiService
import com.negreiros.stefaninitest.data.model.ImageList
import com.negreiros.stefaninitest.data.repository.datasource.ImageRemoteDataSource
import retrofit2.Response

class ImageRemoteDataSourceImpl(
    private val service: ApiService,
    private val filter: String
): ImageRemoteDataSource {
    override suspend fun getImages(): Response<ImageList> = service.getImages(filter)

}
package com.negreiros.stefaninitest.data.api

import com.negreiros.stefaninitest.data.model.ImageList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @Headers("Authorization: Client-ID 1ceddedc03a5d71")
    @GET("gallery/search")
    suspend fun getImages(@Query("q") filter:String): Response<ImageList>
}

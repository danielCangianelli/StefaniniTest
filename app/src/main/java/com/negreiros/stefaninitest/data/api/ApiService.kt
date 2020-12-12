package com.negreiros.stefaninitest.data.api

import com.negreiros.stefaninitest.data.model.ImageList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("gallery/search")
    suspend fun getImages(@Query("q") filter:String): Response<ImageList>
}

//https://api.imgur.com/3
//gallery/search
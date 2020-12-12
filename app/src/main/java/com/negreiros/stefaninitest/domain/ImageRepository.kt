package com.negreiros.stefaninitest.domain

import com.negreiros.stefaninitest.data.model.Image

interface ImageRepository {
    suspend fun getImages(): List<Image>?
}
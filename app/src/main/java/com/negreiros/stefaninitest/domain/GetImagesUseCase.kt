package com.negreiros.stefaninitest.domain

import com.negreiros.stefaninitest.data.model.Image

class GetImagesUseCase(private val imageRepository: ImageRepository) {

    suspend fun execute():List<Image>? = imageRepository.getImages()
}
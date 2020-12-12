package com.negreiros.stefaninitest.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.negreiros.stefaninitest.domain.GetImagesUseCase

class HomeViewModel (
    private val getImagesUseCase: GetImagesUseCase
): ViewModel(){

    fun getImages() = liveData {
        val imageList = getImagesUseCase.execute()
        emit(imageList)
    }

}
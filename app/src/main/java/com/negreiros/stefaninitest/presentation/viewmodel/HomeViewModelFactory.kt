package com.negreiros.stefaninitest.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.negreiros.stefaninitest.domain.GetImagesUseCase


class HomeViewModelFactory(
    private val getImagesUseCase: GetImagesUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(HomeViewModel::class.java)){
            return HomeViewModel(
                getImagesUseCase
            ) as T
        }
        throw IllegalArgumentException("View Model Class desconhecida")
    }
}

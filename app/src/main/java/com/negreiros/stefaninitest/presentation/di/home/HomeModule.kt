package com.negreiros.stefaninitest.presentation.di.home

import com.negreiros.stefaninitest.domain.GetImagesUseCase
import com.negreiros.stefaninitest.presentation.viewmodel.HomeViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @HomeScope
    @Provides
    fun provideHomeViewModelFactory(
        getImagesUseCase: GetImagesUseCase
    ): HomeViewModelFactory {
        return HomeViewModelFactory(
            getImagesUseCase
        )
    }
}
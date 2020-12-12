package com.negreiros.stefaninitest.presentation.di.core

import com.negreiros.stefaninitest.domain.GetImagesUseCase
import com.negreiros.stefaninitest.domain.ImageRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class UseCaseModule {

    @Provides
    fun provideGetImagesUseCase(repository: ImageRepository): GetImagesUseCase {
        return GetImagesUseCase(repository)
    }
}

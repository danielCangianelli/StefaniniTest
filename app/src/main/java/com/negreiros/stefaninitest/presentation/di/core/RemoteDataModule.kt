package com.negreiros.stefaninitest.presentation.di.core

import com.negreiros.stefaninitest.data.api.ApiService
import com.negreiros.stefaninitest.data.repository.datasource.ImageRemoteDataSource
import com.negreiros.stefaninitest.data.repository.datasourceImpl.ImageRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideImageRemoteDataSource(apiService: ApiService): ImageRemoteDataSource {
        return ImageRemoteDataSourceImpl(
            apiService, apiKey
        )
    }

}
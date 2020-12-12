package com.negreiros.stefaninitest.presentation.di.core

import com.negreiros.stefaninitest.data.repository.datasource.ImageCacheDataSource
import com.negreiros.stefaninitest.data.repository.datasourceImpl.ImageCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideImageCacheDataSource(): ImageCacheDataSource {
        return ImageCacheDataSourceImpl()
    }
}
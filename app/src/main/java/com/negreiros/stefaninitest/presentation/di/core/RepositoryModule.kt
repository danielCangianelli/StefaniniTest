package com.negreiros.stefaninitest.presentation.di.core

import com.negreiros.stefaninitest.data.repository.ImageRepositoryImpl
import com.negreiros.stefaninitest.data.repository.datasource.ImageCacheDataSource
import com.negreiros.stefaninitest.data.repository.datasource.ImageRemoteDataSource
import com.negreiros.stefaninitest.domain.ImageRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideBitcoinRepository(
        remote: ImageRemoteDataSource,
        cache: ImageCacheDataSource
    ) : ImageRepository{
        return ImageRepositoryImpl(remote, cache)
    }
}
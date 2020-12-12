package com.negreiros.stefaninitest.presentation.di.core

import com.negreiros.stefaninitest.presentation.di.home.HomeSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        CacheDataModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class
    ]
)
interface AppComponent {

    fun homeSubComponent(): HomeSubComponent.Factory
}
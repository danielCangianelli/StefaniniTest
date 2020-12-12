package com.negreiros.stefaninitest.presentation

import android.app.Application
import com.negreiros.stefaninitest.BuildConfig
import com.negreiros.stefaninitest.presentation.di.Injector
import com.negreiros.stefaninitest.presentation.di.core.*
import com.negreiros.stefaninitest.presentation.di.home.HomeSubComponent

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.FILTER))
            .build()
    }

    override fun createHomeSubComponent(): HomeSubComponent =
        appComponent.homeSubComponent().create()
}
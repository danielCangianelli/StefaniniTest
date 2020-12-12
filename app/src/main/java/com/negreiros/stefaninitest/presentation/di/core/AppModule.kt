package com.negreiros.stefaninitest.presentation.di.core

import android.content.Context
import com.negreiros.stefaninitest.presentation.di.home.HomeSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    subcomponents = [
        HomeSubComponent::class
    ]
)
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}
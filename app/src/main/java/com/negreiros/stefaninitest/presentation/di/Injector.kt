package com.negreiros.stefaninitest.presentation.di

import com.negreiros.stefaninitest.presentation.di.home.HomeSubComponent

interface Injector {

    fun createHomeSubComponent(): HomeSubComponent
}
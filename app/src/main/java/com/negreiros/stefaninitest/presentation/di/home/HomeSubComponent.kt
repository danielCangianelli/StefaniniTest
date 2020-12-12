package com.negreiros.stefaninitest.presentation.di.home

import com.negreiros.stefaninitest.presentation.ui.HomeFragment
import com.negreiros.stefaninitest.presentation.ui.MainActivity
import dagger.Subcomponent

@HomeScope
@Subcomponent(modules = [HomeModule::class])
interface HomeSubComponent{

    fun inject(mainActivity: MainActivity)
    fun inject(homeFragment: HomeFragment)

    @Subcomponent.Factory
    interface Factory{
        fun create(): HomeSubComponent
    }
}
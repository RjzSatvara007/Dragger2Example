package com.rjz.kotlindragger2demo.dragger

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import com.rjz.kotlindragger2demo.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModule(private val  myApplication: MyApplication) {

    @Provides
    @Singleton
    open fun provideApplicationContext(): MyApplication? {
        return myApplication
    }

    @Provides
    @Singleton
    open fun provideContext(): Context? {
        return myApplication
    }

    @Provides
    @Singleton
    open fun provideSharedPref(): SharedPreferences? {
        return myApplication?.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    open fun provideResources(): Resources? {
        return myApplication?.resources
    }

}
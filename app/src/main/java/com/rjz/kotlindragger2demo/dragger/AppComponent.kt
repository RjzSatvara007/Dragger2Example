package com.rjz.kotlindragger2demo.dragger

import com.rjz.kotlindragger2demo.activity.BaseActivity
import com.rjz.kotlindragger2demo.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(myApplication: MyApplication)

    fun inject(baseActivity: BaseActivity)
}
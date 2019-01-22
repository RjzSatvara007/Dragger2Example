package com.rjz.kotlindragger2demo.activity

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rjz.kotlindragger2demo.MyApplication
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {

    //@Inject will not work in kotlin so need to use @Inject set below the var init..

    var myRes: Resources? = null
        @Inject set

    var myContext: Context? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ((application as MyApplication))
            .getAppComponent()!!
            .inject(BaseActivity@ this)
    }
}
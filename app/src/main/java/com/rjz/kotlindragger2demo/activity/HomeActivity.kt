package com.rjz.kotlindragger2demo.activity

import android.os.Bundle
import android.widget.Toast
import com.rjz.kotlindragger2demo.R
import kotlinx.android.synthetic.main.activity_home.*

open class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvTest.setText("Rajesh satvara")

        tvTest.setTextColor(myRes!!.getColor(R.color.colorPrimaryDark))
        Toast.makeText(myContext, "test ",Toast.LENGTH_SHORT).show()
    }
}

package com.example.bindingsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding : com.example.bindingsample.databinding.ActivityMainBinding
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.name = "Shiffa"
        userModel.password = "shiffa"
        mainBinding.userModel = userModel

        var clickHandler= ClickHandler(userModel)
      mainBinding.clickHandler=clickHandler
    }
}

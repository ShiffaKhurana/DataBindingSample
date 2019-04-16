package com.example.bindingsample

import android.util.Log
import android.view.View

class ClickHandler(var user1: UserModel)
{
    // Button click with passing view
    fun onButtonClick(view: View)
    {
        user1.name="Shif"
        user1.password="shif"
        Log.d("CLICK","Button click"+user1.name+user1.password)
    }

    fun onButtonClick2()
    {
        user1.name="Shiffa"
        user1.password="shiffa"
        Log.d("CLICK","Button click2")
    }
}
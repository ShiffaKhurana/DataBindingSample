package com.example.bindingsample

import android.databinding.BaseObservable
import android.databinding.Bindable

class UserModel:BaseObservable(){


    @get:Bindable
    var name: String=""
        set(value) {
            field=value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var password: String=" "
        set(value) {
            field=value
            notifyPropertyChanged(BR.password)
        }

}
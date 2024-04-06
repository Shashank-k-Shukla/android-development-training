package com.example.androiddevelopmenttraining.di.dragger

import android.util.Log
import javax.inject.Inject

class LocalRepo @Inject constructor(){
    fun showData(){
        Log.e("ABC","local repository")
    }
}
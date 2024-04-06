package com.example.androiddevelopmenttraining.di.dragger

import android.util.Log
import javax.inject.Inject

class RemoteRepo @Inject constructor(){
    fun showData(){
        Log.e("ABC","remote repository")
    }
}
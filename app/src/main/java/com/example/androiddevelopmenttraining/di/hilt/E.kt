package com.example.androiddevelopmenttraining.di.hilt

import android.util.Log
import javax.inject.Inject

class E @Inject constructor() {
    fun show(){
        Log.e("ABC","class E")
    }
}
package com.example.androiddevelopmenttraining.di.dragger

import android.util.Log
import javax.inject.Inject

interface RemoteRepo{
    fun showData()
}

class FirebaseStorage @Inject constructor() : RemoteRepo{
    override fun showData() {
        Log.e("ABC","firebase storage")
    }
}

class RetrofitApi : RemoteRepo{
    override fun showData() {
        Log.e("ABC","retrofit api")

    }
}
package com.example.androiddevelopmenttraining.di.hilt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevelopmenttraining.R

class HiltDiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("ABC","HiltDiActivity");
//        val e : E
//        e.show()

    }
}
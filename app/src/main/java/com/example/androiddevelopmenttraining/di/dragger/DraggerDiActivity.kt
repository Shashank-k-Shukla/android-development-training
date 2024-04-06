package com.example.androiddevelopmenttraining.di.dragger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevelopmenttraining.R

class DraggerDiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("ABC","Dragged di activity");

        val userRepositoryComponent = DaggerUserRepositoryComponent.builder().build().getUserRepository()
        userRepositoryComponent.containsData()

    }
}
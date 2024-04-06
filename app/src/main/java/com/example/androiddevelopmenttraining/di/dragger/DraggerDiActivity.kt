package com.example.androiddevelopmenttraining.di.dragger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevelopmenttraining.R
import javax.inject.Inject

class DraggerDiActivity : AppCompatActivity() {

    // for field injection
    @Inject
    lateinit var localRepo: LocalRepo
    @Inject
    lateinit var remoteRepo: RemoteRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("ABC","Dragged di activity");

//        val userRepositoryComponent = DaggerUserRepositoryComponent.builder().build().getUserRepository()
//        val localRepo = DaggerUserRepositoryComponent.builder().build().getLocalRepository()
//        val remoteRepo = DaggerUserRepositoryComponent.builder().build().getRemoteRepository()
//        userRepositoryComponent.containsData()

        // Field-injection
        DaggerUserRepositoryComponent.builder().build().inject(this);

        localRepo.showData()
        remoteRepo.showData()

    }
}
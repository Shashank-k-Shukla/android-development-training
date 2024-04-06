package com.example.androiddevelopmenttraining.di.dragger

import javax.inject.Inject

class UserRepository @Inject constructor(private val remoteRepo: RemoteRepo,
                     private val localRepo: LocalRepo
) {
    fun containsData(){
        localRepo.showData()
        remoteRepo.showData()
    }
}
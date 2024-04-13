package com.example.androiddevelopmenttraining.di.dragger

import javax.inject.Inject
import javax.inject.Named

class UserRepository @Inject constructor(private val remoteRepo: RemoteRepo,
       @Named("shared") private val localRepo: LocalRepo
) {
    fun containsData(){
        localRepo.showData()
        remoteRepo.showData()
    }
}
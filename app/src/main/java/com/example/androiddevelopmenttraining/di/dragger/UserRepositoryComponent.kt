package com.example.androiddevelopmenttraining.di.dragger

import dagger.Component

@Component
interface UserRepositoryComponent {
    fun getUserRepository() : UserRepository

//    fun getLocalRepository() : LocalRepo

//    fun getRemoteRepository() : RemoteRepo

}

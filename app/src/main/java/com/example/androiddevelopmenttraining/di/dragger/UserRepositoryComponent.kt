package com.example.androiddevelopmenttraining.di.dragger

import dagger.Component

@Component(modules = [RepositoryModule::class])
interface UserRepositoryComponent {

    // constructor-injection
//    fun getUserRepository() : UserRepository
//    fun getLocalRepository() : LocalRepo
//    fun getRemoteRepository() : RemoteRepo

    // if user want to create more objects then go for this approach (field-Injection)
    fun inject(diActivity: DraggerDiActivity)

}

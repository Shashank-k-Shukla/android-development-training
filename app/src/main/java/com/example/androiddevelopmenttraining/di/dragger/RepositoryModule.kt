package com.example.androiddevelopmenttraining.di.dragger

import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

//    @Provides
//    fun getLocalRepo() : LocalRepo{
//        return SharedPref()
//    }

    @Provides
    fun getLocalRepo(sqLiteDB: SQLiteDB) : LocalRepo{
        return sqLiteDB
    }

    @Provides
    fun getRemoteRepo() : RemoteRepo{
        return RetrofitApi()
    }

}
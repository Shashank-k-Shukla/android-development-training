package com.example.androiddevelopmenttraining.di.dragger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class RepositoryModule {

    @Provides
    fun getSharedSpace() : LocalRepo{
        return SharedPref()
    }

//    @Named("sqlite")
//    @Provides
//    fun getDBSpace(sqLiteDB: SQLiteDB) : LocalRepo{
//        return sqLiteDB
//    }
        // OR
//    @Binds
//    abstract fun getLocalRepo(sqLiteDB: SQLiteDB) : LocalRepo

    @Provides
    fun getRemoteRepo() : RemoteRepo{
        return RetrofitApi()
    }

}
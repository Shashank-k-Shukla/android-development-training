package com.example.androiddevelopmenttraining.mvvm.repository

import com.example.androiddevelopmenttraining.mvvm.roomdb.User
import com.example.androiddevelopmenttraining.mvvm.roomdb.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepo(private val userDao: UserDao) {

    suspend fun insertAll(user: User) = withContext(Dispatchers.IO){
        userDao.insertAll(user)
    }

    suspend fun deleteAll(user: User) = withContext(Dispatchers.IO){
        userDao.deleteAll(user)
    }

    suspend fun getAll() : List<User> = withContext(Dispatchers.IO){
        userDao.getAll()
    }

}
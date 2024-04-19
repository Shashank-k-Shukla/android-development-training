package com.example.androiddevelopmenttraining.mvvm.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun insertAll(user: User)

    @Delete
    fun deleteAll(user: User)

    @Query("SELECT * from user_table")
    fun getAll() : List<User>

}
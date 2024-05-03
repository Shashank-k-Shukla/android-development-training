package com.example.androiddevelopmenttraining.firebase.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper

@Database(entities = [ User::class ],version = 1)
abstract class UserDatabase : RoomDatabase() {

    companion object{
        private var instance : UserDatabase? = null
        fun getInstance(context: Context) : UserDatabase{
            synchronized( UserDatabase::class.java){
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context,
                        UserDatabase::class.java,
                        "user_db"
                    ).build()
                }
            }
            return instance!!
        }
    }
}
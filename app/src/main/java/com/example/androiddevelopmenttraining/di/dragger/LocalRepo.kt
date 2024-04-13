package com.example.androiddevelopmenttraining.di.dragger

import android.util.Log
import javax.inject.Inject

interface LocalRepo{
    fun showData()
}

class SQLiteDB @Inject constructor() : LocalRepo{
    override fun showData() {
        Log.e("ABC","saved in SQLite database")
    }
}

class SharedPref : LocalRepo{
    override fun showData() {
        Log.e("ABC","saved in Shared preferences")
    }
}
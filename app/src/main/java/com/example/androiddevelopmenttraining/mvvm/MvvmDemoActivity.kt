package com.example.androiddevelopmenttraining.mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevelopmenttraining.R
import com.example.androiddevelopmenttraining.mvvm.repository.UserRepo
import com.example.androiddevelopmenttraining.mvvm.roomdb.AppDatabase
import com.example.androiddevelopmenttraining.mvvm.roomdb.User
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MvvmDemoActivity : AppCompatActivity() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_mvvm_demo_activity)

        val database = AppDatabase.getInstance(this)
        val dao = database.userDao()
        val repository = UserRepo(dao)

//        val user = User(3, "abc", "abc@gmail.com")
        GlobalScope.launch {
//            repository.insertAll(user)
            val data = repository.getAll()
            Log.e("ABC", ">> $data")

        }


    }
}
package com.example.androiddevelopmenttraining.firebase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddevelopmenttraining.R

class SecondActivity : AppCompatActivity() {
    private lateinit var updateBtn : Button
    private lateinit var deleteBtn : Button
    private lateinit var username : EditText
    private lateinit var email : EditText
    private lateinit var phone : EditText
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        updateBtn = findViewById(R.id.updateBtn)
        deleteBtn = findViewById(R.id.deleteBtn)
        username = findViewById(R.id.secondName)
        email = findViewById(R.id.secondEmail)
        phone = findViewById(R.id.secondPhone)
        recyclerView = findViewById(R.id.recyclerView)



    }
}
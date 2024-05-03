package com.example.androiddevelopmenttraining.firebase

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevelopmenttraining.R
import com.example.androiddevelopmenttraining.mvvm.roomdb.User


class DemoFirebase : AppCompatActivity() {
    private val storage = listOf("Firebase storage", "Room database","Firebase realtime")
    private lateinit var spinner: Spinner
    private lateinit var addBtn : Button
    private lateinit var resetBtn : Button
    private lateinit var getDetailsBtn : Button
    private lateinit var username : EditText
    private lateinit var email : EditText
    private lateinit var phone : EditText
    private lateinit var enterPhone : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.demo_firebase)
        spinner = findViewById(R.id.spinner)
        addBtn = findViewById(R.id.add)
        resetBtn = findViewById(R.id.reset)
        getDetailsBtn = findViewById(R.id.getDetails)
        username = findViewById(R.id.username)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phoneNo)
        enterPhone = findViewById(R.id.enterPhone)

        // spinner click listener
        spinner.onItemSelectedListener = SpinnerClickListener()
        val adapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, storage)
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // getDetails button click listener
        getDetailsBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }




    }

}

class SpinnerClickListener : AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Log.e("ABC", " >>> $position $id")

        val item = parent!!.getItemAtPosition(position).toString()
        Toast.makeText(parent.context, "Selected: $item", Toast.LENGTH_LONG).show()    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Log.e("ABC", " >>> ")

    }

}
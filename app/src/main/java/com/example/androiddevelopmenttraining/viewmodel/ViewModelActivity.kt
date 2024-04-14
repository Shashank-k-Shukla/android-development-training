package com.example.androiddevelopmenttraining.viewmodel

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androiddevelopmenttraining.R
import com.example.androiddevelopmenttraining.databinding.ActivityMainBinding

class ViewModelActivity : AppCompatActivity() {

    private lateinit var activityViewBinding : ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityViewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityViewBinding.root
        enableEdgeToEdge()
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        activityViewBinding.countBtn.setOnClickListener {
            Log.e("ABC", "clicked")
//            num++
//            activityViewBinding.countText.text = num.toString()
            viewModel.increaseNumber()
            activityViewBinding.countText.text = viewModel.getNumber().toString()
        }
        activityViewBinding.countText.text = viewModel.getNumber().toString()
    }
}
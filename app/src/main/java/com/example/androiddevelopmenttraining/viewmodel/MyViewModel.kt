package com.example.androiddevelopmenttraining.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var num = 0

    fun increaseNumber(){
        num ++
    }

    fun getNumber() : Int {
        return num
    }

}
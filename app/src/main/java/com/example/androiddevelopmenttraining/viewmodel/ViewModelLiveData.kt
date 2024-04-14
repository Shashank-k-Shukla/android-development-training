package com.example.androiddevelopmenttraining.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLiveData : ViewModel() {
    private var mutableLiveData = MutableLiveData<Int>()
    private var num = 0

    init {
        mutableLiveData.value = num
    }

    fun increaseNum(){
        num++
        mutableLiveData.value = num
    }

    fun getNum() : LiveData<Int> {
        return mutableLiveData
    }
}
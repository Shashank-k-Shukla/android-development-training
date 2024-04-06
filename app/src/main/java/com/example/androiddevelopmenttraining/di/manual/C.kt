package com.example.androiddevelopmenttraining.di.manual

import android.util.Log

//class C {
//    private val a = A() // instance of class A
//    private val b = B()  // instance of class B
//    fun show(){
//        a.show()
//        b.show()
//        Log.e("ABC","class C")
//    }
    // here class C is tightly coupled with class A and B

//class C (private val a : A, private val b : B) {
//    fun show(){
//        a.show()
//        b.show()
//        Log.e("ABC","class C")
//    }
    // type 1 : constructor injection

//class C {
//    private lateinit var a : A
//    private lateinit var b : B
//
//    fun setInstance( a : A, b : B){
//        this.a = a
//        this.b = b
//    }
//    fun show(){
//        a.show()
//        b.show()
//        Log.e("ABC","class C")
//    }
    // type 2 : method injection or getter injection

class C {
    private val a = ServiceLocator.getA()
    private val b = ServiceLocator.getB()
    fun show() {
        a.show()
        b.show()
        Log.e("ABC","class C")
    }
    // Alternative approach of dragger and hilt

}
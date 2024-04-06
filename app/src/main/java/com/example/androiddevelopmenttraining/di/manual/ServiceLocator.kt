package com.example.androiddevelopmenttraining.di.manual

object ServiceLocator {
    fun getA() : A = A()
    fun getB() : B = B()

}
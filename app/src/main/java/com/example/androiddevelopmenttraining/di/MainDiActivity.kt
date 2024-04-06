package com.example.androiddevelopmenttraining.di

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.androiddevelopmenttraining.R
import com.example.androiddevelopmenttraining.di.manual.A
import com.example.androiddevelopmenttraining.di.manual.B
import com.example.androiddevelopmenttraining.di.manual.C

class MainDiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // tightly coupled classes (Dependency issue)
//        val c = C()
//        c.show()

        // type 1 : constructor injection to resolve di
//        val a = A()
//        val b = B()
//        val c = C(a,b)
//        c.show()

        // type 2 : method injection or getter injection
//        val a = A()
//        val b = B()
//        val c = C()
//        c.setInstance(a,b)
//        c.show()

        // service-locator alternative way of dragger and hilt
        val c = C()
        c.show()

    }
}
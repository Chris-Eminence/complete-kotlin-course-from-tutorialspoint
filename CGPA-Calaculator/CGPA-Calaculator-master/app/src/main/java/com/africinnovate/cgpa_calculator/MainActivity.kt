package com.africinnovate.cgpa_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    private val SPLASH_SCREEN_TIME: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this, GetStarted::class.java))
         finish()
        },SPLASH_SCREEN_TIME)
    }
}
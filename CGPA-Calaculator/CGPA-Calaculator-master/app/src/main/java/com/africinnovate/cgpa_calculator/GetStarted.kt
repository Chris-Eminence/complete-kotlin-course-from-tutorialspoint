package com.africinnovate.cgpa_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GetStarted : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

    }

    fun getStarted(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
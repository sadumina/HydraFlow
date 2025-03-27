package com.example.hydraflow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)

//        val btnsignup: Button = findViewById(R.id.btnsignup)
//        btnsignup.setOnClickListener {
//            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show() // Debugging
//
//            val intent = Intent(this, Home_Page::class.java)
//            startActivity(intent)
//        }

    }
}
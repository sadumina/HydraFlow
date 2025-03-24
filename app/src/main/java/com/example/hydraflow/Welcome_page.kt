package com.example.hydraflow

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)
        val textViewGreeting : TextView = findViewById(R.id.textGreeting)
        val name = intent.getStringExtra("User_name")

        if(name != null){
            textViewGreeting.text = "Hello , $name"
        }
        else {
            textViewGreeting.text = "Hello Guest"
        }
    }
}
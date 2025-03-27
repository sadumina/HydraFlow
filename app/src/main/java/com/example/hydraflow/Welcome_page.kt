package com.example.hydraflow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Welcome_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        val btnNavigate: Button = findViewById(R.id.welcomebtn)
        btnNavigate.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, Home_page::class.java)
            startActivity(intent)
        }
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
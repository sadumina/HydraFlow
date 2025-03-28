package com.example.hydraflow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Logout_page : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logout_page)


        val btnNavigate2: Button = findViewById(R.id.logoutbtn2)
        btnNavigate2.setOnClickListener {
            Toast.makeText(this, "logout!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btnNavigate3: Button = findViewById(R.id.back)
        btnNavigate3.setOnClickListener {
            Toast.makeText(this, "logout!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, Settings_page::class.java)
            startActivity(intent)
        }
    }
}
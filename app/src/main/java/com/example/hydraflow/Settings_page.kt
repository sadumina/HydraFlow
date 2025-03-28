package com.example.hydraflow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Settings_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_settings_page)


        val btnNavigate3: Button = findViewById(R.id.btnlogout)
        btnNavigate3.setOnClickListener {
            Toast.makeText(this, "logout!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, Logout_page::class.java)
            startActivity(intent)
        }


    }
}
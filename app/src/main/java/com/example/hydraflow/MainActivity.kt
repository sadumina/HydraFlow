package com.example.hydraflow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2) // Make sure this layout name is correct

        val btnNavigate: Button = findViewById(R.id.btngetstarted)
        btnNavigate.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}

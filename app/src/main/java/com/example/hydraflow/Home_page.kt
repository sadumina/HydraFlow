package com.example.hydraflow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        val textView: TextView = findViewById(R.id.achivmenttext)
        textView.setOnClickListener {
            val intent = Intent(this, Achivments_page::class.java)
            startActivity(intent)
        }

        val textView1: TextView = findViewById(R.id.goaltext)
        textView1.setOnClickListener {
            val intent = Intent(this, Goal_page::class.java)
            startActivity(intent)
        }

        val textView2: TextView = findViewById(R.id.tipstext)
        textView2.setOnClickListener {
            val intent = Intent(this, Tips_page::class.java)
            startActivity(intent)
        }

    }
}

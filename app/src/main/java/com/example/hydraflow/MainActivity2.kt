package com.example.hydraflow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3) // Ensure this is correct

        val btnlogin: Button = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show() // Debugging

            val intent = Intent(this, Welcome_page::class.java)
            startActivity(intent)
        }
        val btnSendData : Button = findViewById(R.id.btnlogin)
        val editTextName : EditText = findViewById(R.id.editName)

        btnSendData.setOnClickListener {

           val name = editTextName.text.toString()
            val intent = Intent(this,Welcome_page::class.java)
           intent.putExtra("User_name",name)
            startActivity(intent)
       }
        val textView6: TextView = findViewById(R.id.linksign)
        textView6.setOnClickListener {
            val intent = Intent(this, Signup_page::class.java)
            startActivity(intent)
        }


    }
}

package com.example.hydraflow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Tips_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tips_page) // ✅ FIXED

        val btnOpenWeb: Button = findViewById(R.id.btnexplore) // ✅ Make sure this ID exists in XML
        btnOpenWeb.setOnClickListener {
            val webpage = Uri.parse("https://www.google.com/search?q=hydration+tips&oq=hydration+tips&gs_lcrp=EgZjaHJvbWUyCQgAEEUYORiABDIHCAEQABiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABNIBCTY2MzhqMGoxNagCCLACAfEFXbtWlJkuAVo&sourceid=chrome&ie=UTF-8")
            val intent = Intent(Intent.ACTION_VIEW, webpage)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No web browser found!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package com.example.logintablayout

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ambil username dan NIM dari Intent
        val username = intent.getStringExtra("USERNAME")
        val nim = intent.getStringExtra("NIM")

        // Inisialisasi TextView
        val textViewUsername = findViewById<TextView>(R.id.textViewName)
        val textViewNIM = findViewById<TextView>(R.id.textViewNIM)

        // Set data nama dan NIM
        textViewUsername.text = "Nama: $username"
        textViewNIM.text = "NIM: $nim"
    }
}

package com.example.logintablayout

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Ambil username dari Intent
        val username = intent.getStringExtra("USERNAME") ?: "amel"
        val nim = intent.getStringExtra("NIM") ?: "1122" // Ambil NIM jika diperlukan

        // Set welcome message
        findViewById<TextView>(R.id.tvWelcome).text = "Welcome back, $username!"

        // Button untuk Profile
        val btnSad = findViewById<ImageButton>(R.id.btnSad)
        btnSad.setOnClickListener {
            // Arahkan ke ProfileActivity saat icon Profile diklik
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("USERNAME", username) // Kirim username ke ProfileActivity
            intent.putExtra("NIM", nim) // Kirim NIM ke ProfileActivity
            startActivity(intent)
        }

        // Button untuk Logout
        val btnHappy = findViewById<ImageButton>(R.id.btnHappy)
        btnHappy.setOnClickListener {
            // Logout user dan kembali ke Login
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}

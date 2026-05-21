package com.example.praktikum4

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        supportActionBar?.hide() // hilangkan action bar
        delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO // paksa mode terang
        setContentView(R.layout.activity_latihan1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // tunggu 3 detik kemudian pindah ke LoginActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // start LoginActivity
            val intentLatihan1 = Intent(this, Latihan2::class.java)
            intentLatihan1.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intentLatihan1)
            finish()
        }, 3000)
    }
}
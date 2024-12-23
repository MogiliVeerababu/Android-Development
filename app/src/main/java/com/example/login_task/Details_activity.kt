package com.example.login_task

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Details_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        val text = findViewById<CustomView>(R.id.custom_view_id)
        val receive_text = intent.getStringExtra("dataKey")?:" "
        text.setTEXT(receive_text)
    }
}
package com.example.login_task

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dashboardactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboardactivity)
        val btn = findViewById<Button>(R.id.backButton)
        btn.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        val listView = findViewById<ListView>(R.id.list1)
        val data = arrayOf(
            "Pooja",
            "Nikhil",
            "Karthik",
            "Manvitha",
            "Harshitha",
            "Deepu",
            "Chadu",
            "Joshna",
            "Vishal",
            "Pavan"
        )
        //change


        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        // Set the adapter to the ListView
        listView.adapter = arrayAdapter

        // Set an item click listener for the ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, Details_activity::class.java)
            intent.putExtra("dataKey", data[position])
            startActivity(intent)
        }


    }

    }

package com.example.login_task

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.login_task.R.id.submitButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views by their IDs with explicit types
        val btn: Button = findViewById(submitButton)
        //val emailInput: EditText = findViewById(R.id.usernameInput)
        //val passwordInput: EditText = findViewById(R.id.passwordInput)

        // Set up click listener for the button
        btn.setOnClickListener {
            //val email = emailInput.text.toString()
            //val password = passwordInput.text.toString()

            //if (email == "veerababu.mogili@rampgroup.com" && password == "Veera@2001") {
                // Navigate to the dashboard activity
                val intent = Intent(this, dashboardactivity::class.java)
                startActivity(intent)
            }
        }
    }
//}

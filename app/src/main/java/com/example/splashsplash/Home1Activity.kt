package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_admin.*
import kotlinx.android.synthetic.main.activity_home.*

class Home1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button




        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@Home1Activity, user_name, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same
            if (user_name.toString().equals("admin") && password.toString().equals("admin")) {
                var intent = Intent(Home1Activity@ this, AdminlogActivity::class.java)
                startActivity(intent)


                Toast.makeText(applicationContext, "Login successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

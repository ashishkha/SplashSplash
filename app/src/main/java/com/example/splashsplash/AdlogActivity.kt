package com.example.splashsplash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_adlog.*
import kotlinx.android.synthetic.main.activity_admin.*
import kotlinx.android.synthetic.main.activity_admin.password

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_logged.*


class AdlogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adlog)

        var et_username = findViewById(R.id.et_username) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_login = findViewById(R.id.btn_login) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_username.setText("")
            et_password.setText("")
        }

        // set on-click listener
        //if (username.equals("admin") && password.//equals("admin123")) {
        btn_login.setOnClickListener {

            //if (et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("admin123")) {


                val intent = Intent(this, AdminlogActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "logged in", Toast.LENGTH_SHORT).show()

            } //else {
                //Toast.makeText(this, "invalid credentials", Toast.LENGTH_LONG).show()
            }
        }


                //
// }

        






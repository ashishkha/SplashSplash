package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logged.*
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class LoggedActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        // get reference to all views
        var et_username = findViewById(R.id.username) as EditText
        var et_password = findViewById(R.id.password) as EditText
        var btn_login = findViewById(R.id.login) as Button
        var btn_cancel = findViewById(R.id.cancel) as Button

        if(username.equals("admin") && password.equals("admin123")) {
            val intent = Intent(baseContext, AdminlogActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this@LoggedActivity, "enter email and password", Toast.LENGTH_LONG).show()
        }

        btn_cancel.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_username.setText("")
            et_password.setText("")
        }

        //            Toast.makclick listener
            btn_login.setOnClickListener {
                val username = et_username.text;
                val password = et_password.text;
                Toast.makeText(this@LoggedActivity, username, Toast.LENGTH_LONG).show()
                val intent = Intent(baseContext, AdminlogActivity::class.java)
                startActivity(intent)


                // your code to validate the user_name and password combination
                // and verify the same

            }
        }
    }

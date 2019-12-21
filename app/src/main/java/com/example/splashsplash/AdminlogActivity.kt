package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adminlog.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.txtViewEvent
import kotlinx.android.synthetic.main.activity_main.txtViewQuery
import kotlinx.android.synthetic.main.activity_main.txtViewReminder

class AdminlogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adminlog)

        txtViewEvent.setOnClickListener {
            val intent = Intent(this, EventActivity::class.java)
            startActivity(intent)
        }
        txtViewReminder.setOnClickListener {
            val intent = Intent(this, NotiActivity::class.java)
            startActivity(intent)
        }
        txtViewQuery.setOnClickListener {
            val intent = Intent(this, QueryActivity::class.java)
            startActivity(intent)


        }
        txtViewStudentRegistration.setOnClickListener {
            val intent = Intent(this, SRActivity::class.java)
            startActivity(intent)


        }

    }
}


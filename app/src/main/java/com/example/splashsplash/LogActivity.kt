package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*
import project.async.com.event.HomeActivity

class LogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        admin.setOnClickListener {
            val intent = Intent(baseContext, Home1Activity::class.java)
            startActivity(intent)
        }

        user.setOnClickListener {
            val intent = Intent(baseContext, UserLoggedActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*

class LogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        admin.setOnClickListener {
            val intent = Intent(baseContext, LoggedActivity::class.java)
            startActivity(intent)

            user.setOnClickListener {
                val intent = Intent(baseContext, useloggedActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_event.*
import kotlinx.android.synthetic.main.activity_log.*

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        ADD.setOnClickListener {
            val intent = Intent(baseContext, AddEventActivity::class.java)
            startActivity(intent)
        }

        UPDATE.setOnClickListener {
            val intent = Intent(baseContext, UpdateEventActivity::class.java)
            startActivity(intent)
        }
    }
}

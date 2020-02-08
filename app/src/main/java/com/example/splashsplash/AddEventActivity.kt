package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_event.*
import kotlinx.android.synthetic.main.activity_event.*

class AddEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)

        add.setOnClickListener {
             Toast.makeText(this, "event added", Toast.LENGTH_SHORT).show()
        }
    }
}
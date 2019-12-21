package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_event.*

class UpdateEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_event)

        add.setOnClickListener {
            val Toast = Toast.makeText(this, "event added", Toast.LENGTH_SHORT).show()
        }
    }
}

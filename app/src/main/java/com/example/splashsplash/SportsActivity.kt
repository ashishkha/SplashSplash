package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sports.*
import kotlinx.android.synthetic.main.activity_stud_event.*

class SportsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        txtinform.setOnClickListener {
            val intent = Intent(this, InformActivity::class.java)
            startActivity(intent)
        }

        txtregister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }



    }
}

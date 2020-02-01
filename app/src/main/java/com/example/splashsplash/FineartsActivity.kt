package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finearts.*
import kotlinx.android.synthetic.main.activity_mania.*

class FineartsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finearts)

        txtinform7.setOnClickListener {
            val intent = Intent(this, Inform7Activity::class.java)
            startActivity(intent)
        }

        txtregister7.setOnClickListener {
            val intent = Intent(this, Register7Activity::class.java)
            startActivity(intent)
        }



    }
}

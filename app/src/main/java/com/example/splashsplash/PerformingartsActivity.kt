package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_performingarts.*
import kotlinx.android.synthetic.main.activity_technokraft.*

class PerformingartsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_performingarts)

        txtinform5.setOnClickListener {
            val intent = Intent(this, Inform5Activity::class.java)
            startActivity(intent)
        }

        txtregister5.setOnClickListener {
            val intent = Intent(this, Register5Activity::class.java)
            startActivity(intent)
        }

    }
}

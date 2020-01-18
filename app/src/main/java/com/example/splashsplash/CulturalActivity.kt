package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cultural.*
import kotlinx.android.synthetic.main.activity_sports.*

class CulturalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cultural)

        txtinform2.setOnClickListener {
            val intent = Intent(this, Inform2Activity::class.java)
            startActivity(intent)
        }

        txtregister2.setOnClickListener {
            val intent = Intent(this, Register2Activity::class.java)
            startActivity(intent)
        }


    }
}

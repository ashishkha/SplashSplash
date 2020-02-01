package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mastermind.*
import kotlinx.android.synthetic.main.activity_performingarts.*

class MastermindActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mastermind)

        txtinform6.setOnClickListener {
            val intent = Intent(this, Inform6Activity::class.java)
            startActivity(intent)
        }

        txtregister6.setOnClickListener {
            val intent = Intent(this, Register6Activity::class.java)
            startActivity(intent)
        }


    }
}

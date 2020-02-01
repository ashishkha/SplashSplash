package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cultural.*
import kotlinx.android.synthetic.main.activity_mania.*

class ManiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mania)

        txtinform3.setOnClickListener {
            val intent = Intent(this, Inform3Activity::class.java)
            startActivity(intent)
        }

        //txtregister3.setOnClickListener {
            //val intent = Intent(this, Register3Activity::class.java)
            //startActivity(intent)
        //}


    }
}

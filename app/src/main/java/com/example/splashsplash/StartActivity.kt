package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class StartActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_start)
            val background = object : Thread() {
                override fun run() {
                try {
                    Thread.sleep(4000)
                    val intent = Intent(baseContext, LogActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}

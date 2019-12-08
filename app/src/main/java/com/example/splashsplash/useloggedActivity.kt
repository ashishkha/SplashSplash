package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*
import kotlinx.android.synthetic.main.activity_uselogged.*

class useloggedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uselogged)

        cultural.setOnClickListener {
            val intent = Intent(baseContext, cultActivity::class.java)
            startActivity(intent)

        }
    }
}

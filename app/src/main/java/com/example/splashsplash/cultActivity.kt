package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cult.*
import kotlinx.android.synthetic.main.activity_log.*

class cultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cult)

        info.setOnClickListener {
            val intent = Intent(baseContext, infoActivity::class.java)
            startActivity(intent)
        }
    }
}

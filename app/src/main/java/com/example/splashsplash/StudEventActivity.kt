package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adminlog.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.txtViewEvent
import kotlinx.android.synthetic.main.activity_main.txtViewQuery
import kotlinx.android.synthetic.main.activity_main.txtViewReminder
import kotlinx.android.synthetic.main.activity_stud_event.*

class StudEventActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stud_event)

        txtsports.setOnClickListener {
            val intent = Intent(this, SportsActivity::class.java)
            startActivity(intent)
        }

        txtMania.setOnClickListener {
            val intent = Intent(this, ManiaActivity::class.java)
            startActivity(intent)
        }
        txtPerformingarts.setOnClickListener {
            val intent = Intent(this, PerformingartsActivity::class.java)
            startActivity(intent)
        }
        txtTechnokraft.setOnClickListener {
            val intent = Intent(this, TechnokraftActivity::class.java)
            startActivity(intent)

        }
        txtFinearts.setOnClickListener {
            val intent = Intent(this, FineartsActivity::class.java)
            startActivity(intent)

        }

        txtMastermind.setOnClickListener {
            val intent = Intent(this, MastermindActivity::class.java)
            startActivity(intent)

        }


    }

}

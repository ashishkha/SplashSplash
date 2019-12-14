package com.example.splashsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_log.*
import kotlinx.android.synthetic.main.activity_uselogged.*

class useloggedActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.query -> startQueryActivity()
        }
    }

    private fun startQueryActivity() {
        var intent=Intent(useloggedActivity@this,QueryActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uselogged)

        query.setOnClickListener(this)

        cultural.setOnClickListener {
            val intent = Intent(baseContext, cultActivity::class.java)
            startActivity(intent)



        }
    }
}

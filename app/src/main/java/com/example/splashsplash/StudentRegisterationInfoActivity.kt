package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_student_registeration_info.*

class StudentRegisterationInfoActivity : AppCompatActivity() {

    private var studentRegisterationInfoAdapter: StudentRegisterationInfoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_registeration_info)

        authRetrieve()

        if (studentRegisterationInfoAdapter == null) {
            studentRegisterationInfoAdapter = StudentRegisterationInfoAdapter()
        }

        reclerView.layoutManager = LinearLayoutManager(this)
        reclerView.adapter = studentRegisterationInfoAdapter
    }

    private fun authRetrieve() {

    }
}

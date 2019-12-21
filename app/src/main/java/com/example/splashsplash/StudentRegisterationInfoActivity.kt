package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_student_registeration_info.*
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.ValueEventListener
import android.util.Log


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
        val database = FirebaseDatabase.getInstance()
        var myRef = database.getReference("Users")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val map = dataSnapshot.value as Map<String, Any>


                var usernameList = ArrayList<String>()

                map.forEach { (key, value) ->
                    var userMap = value as Map<String, String>
                    userMap.forEach { (key, value) ->
                        Log.d("Tag", "value added in fb 4:")
                        usernameList.add(value)
                    }
                }
                Log.d("Tag", "value added in fb 3:")
                studentRegisterationInfoAdapter?.setData(usernameList)
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.d("Tag", "value added in fb 2:" + error)
            }
        })
    }
}

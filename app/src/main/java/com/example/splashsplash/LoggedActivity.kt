package com.example.splashsplash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_logged.*
import kotlinx.android.synthetic.main.activity_user_logged.*


class LoggedActivity : AppCompatActivity(){


    private lateinit var mAuth: FirebaseAuth
    lateinit var username: String
    lateinit var password: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)


        // get reference to all views
        var et_username = findViewById(R.id.username) as EditText
        var et_password = findViewById(R.id.password) as EditText
        var btn_login = findViewById(R.id.login) as Button
        var btn_cancel = findViewById(R.id.cancel) as Button

        /*login.setOnClickListener {

            //register
            Log.d("TAG", "fb auth:1")
            mAuth = FirebaseAuth.getInstance()

            username = userNameEditText.text.toString()
            password = passwordEdiText.text.toString()

            if (!username.isEmpty() && !password.isEmpty()) {
                Log.d("TAG", "fb auth:3")
                mAuth?.createUserWithEmailAndPassword(username, password)
                    ?.addOnCompleteListener(this, object : OnCompleteListener<AuthResult> {
                        override fun onComplete(task: Task<AuthResult>) {
                            Log.d("TAG", "fb auth:2")
                            if (task.isSuccessful) {
                                Log.d("TAG", "fb auth:6:" + task.result)
                                Toast.makeText(this@LoggedActivity, "Success", Toast.LENGTH_SHORT)
                                    .show()

                                //add user email to database

                                val database = FirebaseDatabase.getInstance()
                                var myRef = database.getReference("Users")
                                *//*val myRefs =
                                    database.getReference(System.currentTimeMillis().toString())*//*

                                myRef.child(System.currentTimeMillis().toString()).push().setValue(username)

                                *//*myRef.("Users").push().setValue(username)*//*


                                val user = mAuth.currentUser
                                val intent = Intent(baseContext, LoggedActivity::class.java)
                                startActivity(intent)
                            } else {
                                Log.d("TAG", "fb auth:5:" + task.exception)
                                alreadYloggedIn()
                            }
                        }


                    }
                    )
            }



        if(username.equals("admin") && password.equals("admin123")) {
            val intent = Intent(baseContext, AdminlogActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this@LoggedActivity, "enter email and password", Toast.LENGTH_LONG).show()
        }

        btn_cancel.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_username.setText("")
            et_password.setText("")
        }


        //            Toast.makclick listener
            btn_login.setOnClickListener {
                val username = et_username.text;
                val password = et_password.text;
                Toast.makeText(this@LoggedActivity, username, Toast.LENGTH_LONG).show()
                val intent = Intent(baseContext, AdminlogActivity::class.java)
                startActivity(intent)


                // your code to validate the user_name and password combination
                // and verify the same

            }
        }*/

        login.setOnClickListener {
            val username = et_username.text;
            val password = et_password.text;
            Toast.makeText(this@LoggedActivity, username, Toast.LENGTH_LONG).show()
            val intent = Intent(baseContext, AdminlogActivity::class.java)
            startActivity(intent)


            // your code to validate the user_name and password combination
            // and verify the same

        }
    }

    private fun alreadYloggedIn() {
        mAuth.signInWithEmailAndPassword(username, password)
            ?.addOnCompleteListener(this, object : OnCompleteListener<AuthResult> {
                override fun onComplete(task: Task<AuthResult>) {
                    if (task.isSuccessful) {
                        Toast.makeText(this@LoggedActivity, "Already Logged In", Toast.LENGTH_SHORT).show()
                    } else {

                    }
                }
            })
    }

}





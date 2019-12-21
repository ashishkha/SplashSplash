package com.example.splashsplash

import android.content.Intent
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import kotlinx.android.synthetic.main.activity_log.*
                import kotlinx.android.synthetic.main.activity_logged.*
                import com.google.firebase.auth.FirebaseAuth
                import android.util.Log
                import android.widget.Toast
                import com.google.android.gms.tasks.OnCompleteListener
                import com.google.android.gms.tasks.Task
                import com.google.firebase.auth.AuthResult
import kotlinx.android.synthetic.main.activity_logged.login
import kotlinx.android.synthetic.main.activity_user_logged.*

class UserLoggedActivity : AppCompatActivity() {

            private lateinit var mAuth: FirebaseAuth
            lateinit var username:String
            lateinit var password:String

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_logged)

                login.setOnClickListener {

                    //register
                    Log.d("TAG","fb auth:1")
                    mAuth = FirebaseAuth.getInstance()

                    username=userNameEditText.text.toString()
                    password=passwordEdiText.text.toString()

                    if(!username.isEmpty() && !password.isEmpty()){
                        Log.d("TAG","fb auth:3")
                        mAuth?.createUserWithEmailAndPassword(username,password)
                            ?.addOnCompleteListener(this,object:OnCompleteListener<AuthResult>{
                                override fun onComplete(task: Task<AuthResult>) {
                                    Log.d("TAG","fb auth:2")
                                    if(task.isSuccessful) {
                                        Log.d("TAG", "fb auth:6:" + task.result)
                                        Toast.makeText(this@UserLoggedActivity, "Success", Toast.LENGTH_SHORT).show()
                                        val user = mAuth.currentUser
                                        val intent = Intent(baseContext, StudEventActivity::class.java)
                                        startActivity(intent)

                                    }
                                    else{
                                        Log.d("TAG","fb auth:5:"+task.exception)
                                        alreadYloggedIn()
                                    }
                                    val intent = Intent(baseContext, StudEventActivity::class.java)
                                    startActivity(intent)

                                }



                            }
                            )
                    }


                }





            }

            private fun alreadYloggedIn() {
                mAuth.signInWithEmailAndPassword(username,password)
                    ?.addOnCompleteListener(this,object : OnCompleteListener<AuthResult>{
                        override fun onComplete(task: Task<AuthResult>) {
                            if(task.isSuccessful){
                                Toast.makeText(this@UserLoggedActivity,"Already Logged In",Toast.LENGTH_SHORT).show()
                            }else{

                            }
                        }
                    })
            }
        }



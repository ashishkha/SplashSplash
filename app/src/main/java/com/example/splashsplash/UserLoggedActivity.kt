package com.example.splashsplash

import android.content.Intent

                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import kotlinx.android.synthetic.main.activity_log.*
                //*import kotlinx.android.synthetic.main.activity_logged.*
                import com.google.firebase.auth.FirebaseAuth
                import android.util.Log
                import android.widget.Toast
                import com.google.android.gms.tasks.OnCompleteListener
                import com.google.android.gms.tasks.Task
                import com.google.firebase.auth.AuthResult
//import kotlinx.android.synthetic.main.activity_logged.
import kotlinx.android.synthetic.main.activity_user_logged.*

class UserLoggedActivity : AppCompatActivity() {

            private lateinit var mAuth: FirebaseAuth
            lateinit var usernameAssign:String
            lateinit var passwordAssign:String

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_user_logged)

                btncancel.setOnClickListener {
                    // clearing user_name and password edit text views on reset button click
                    userNameEditText.setText("")
                    passwordEditText.setText("")
                }


                btnsubmit.setOnClickListener {

                    //register
                    Log.d("TAG","fb auth:1")
                    mAuth = FirebaseAuth.getInstance()

                    usernameAssign=userNameEditText.text.toString()
                    passwordAssign=passwordEditText.text.toString()

                    if(!usernameAssign.isEmpty() && !passwordAssign.isEmpty()){
                        Log.d("TAG","fb auth:3")
                        mAuth?.createUserWithEmailAndPassword(usernameAssign,passwordAssign)
                            ?.addOnCompleteListener(this,object:OnCompleteListener<AuthResult>{
                                override fun onComplete(task: Task<AuthResult>) {
                                    Log.d("TAG","fb auth:2")
                                    if(task.isSuccessful) {
                                        Log.d("TAG", "fb auth:6:" + task.result)
                                        Toast.makeText(this@UserLoggedActivity, "Success", Toast.LENGTH_SHORT).show()
                                        val user = mAuth.currentUser
                                        val intent = Intent(baseContext, NavActivity::class.java)
                                        startActivity(intent)

                                    }
                                    else{
                                        Log.d("TAG","fb auth:5:"+task.exception)
                                        alreadYloggedIn()
                                    }
                                    val intent = Intent(baseContext, NavActivity::class.java)
                                    startActivity(intent)

                                }



                            })

                    }


                }





            }

            private fun alreadYloggedIn() {
                mAuth.signInWithEmailAndPassword(usernameAssign,passwordAssign)
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



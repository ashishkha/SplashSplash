package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_query.*

class QueryActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnSubmit->submitClick()
        }
    }

    private fun submitClick() {
        if(!ediText.text.isEmpty()){
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference(System.currentTimeMillis().toString())

            myRef.setValue(ediText.text.toString())

            showToastMessage("Submit successfull!!")
        }else{
            showToastMessage("Field cannot be empty")
        }
    }

    private fun showToastMessage(message: String) {
        Toast.makeText(QueryActivity@this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_query)

        btnSubmit.setOnClickListener(this)
    }
}

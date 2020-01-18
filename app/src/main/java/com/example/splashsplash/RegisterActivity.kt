package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_submit.setOnClickListener(View.OnClickListener {
            buttonClicked()
        })

        rg_gender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            if (checkedId == R.id.rb_male){
                Toast.makeText(this, "Checked "+ rb_male.text.toString(), Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Checked "+ rb_female.text.toString(), Toast.LENGTH_SHORT).show();
            }
        })

        chk_kabaddi.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Checked "+ chk_kabaddi.text.toString(), Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Unchecked "+ chk_kabaddi.text.toString(), Toast.LENGTH_SHORT).show();
        })
    }

    fun buttonClicked(){
        var fname : String = txt_fname.text.toString()
        var lname : String = txt_lname.text.toString()
        var colname : String = txt_colname.text.toString()
        var gender : String = ""
        if(rb_female.isChecked)
            gender = rb_female.text.toString()
        else if (rb_male.isChecked)
            gender = rb_male.text.toString()

        var games : String = ""
        if (chk_kabaddi.isChecked)
            games += chk_kabaddi.text.toString() + " "
        if (chk_khokho.isChecked)
            games += chk_khokho.text.toString() + " "
        if (chk_cricket.isChecked)
            games += chk_cricket.text.toString() + " "

        Toast.makeText(this, "name is : " + fname + " " +lname, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "gender is : " + gender , Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "colname is : " + colname , Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hobbies are : " + games , Toast.LENGTH_SHORT).show()

    }


}



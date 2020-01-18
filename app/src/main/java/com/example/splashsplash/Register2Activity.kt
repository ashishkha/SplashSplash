package com.example.splashsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.btn_submit
import kotlinx.android.synthetic.main.activity_register.rb_female
import kotlinx.android.synthetic.main.activity_register.rb_male
import kotlinx.android.synthetic.main.activity_register.rg_gender
import kotlinx.android.synthetic.main.activity_register.txt_colname
import kotlinx.android.synthetic.main.activity_register.txt_fname
import kotlinx.android.synthetic.main.activity_register.txt_lname
import kotlinx.android.synthetic.main.activity_register2.*

class Register2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

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

        var function : String = ""
        if (chk_mrmrssn.isChecked)
            function += chk_mrmrssn.text.toString() + " "
        if (chk_fashionshow.isChecked)
            function += chk_fashionshow.text.toString() + " "
        if (chk_singing.isChecked)
            function += chk_singing.text.toString() + " "

        Toast.makeText(this, "name is : " + fname + " " +lname, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "gender is : " + gender , Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "colname is : " + colname , Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "function interested is : " + function , Toast.LENGTH_SHORT).show()

    }


}



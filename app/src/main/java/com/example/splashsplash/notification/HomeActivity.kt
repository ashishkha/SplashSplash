package project.async.com.event

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.splashsplash.AdminlogActivity
import com.example.splashsplash.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnSubmit -> submitBtnClicked()
        }
    }

    private fun submitBtnClicked() {
        var email = editTextEmail.text.toString()
        var password = editTextPassword.text.toString()

        if (email.isEmpty()) {
            showToastMessage("Email is empty")
            return
        }else if (password.isEmpty()) {
            showToastMessage("Password is empty")
            return
        }

        if(email.equals("admin") && password.equals("admin")){
            var intent=Intent(HomeActivity@this, AdminlogActivity::class.java)
            startActivity(intent)
        }else{
            showToastMessage("Invalid Credentials")
        }

    }

    private fun showToastMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnSubmit.setOnClickListener(this)
    }
}

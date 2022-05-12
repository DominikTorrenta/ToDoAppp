package com.example.todoappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.todoappp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val validator = Validator()

        binding.button.setOnClickListener{

            binding.InputEmail.error =
            validator.emailvalid(binding.emailText.text)
            binding.InputPassword.error =
            validator.passwordvalid(binding.passwordText.text)

                if (binding.InputEmail.error == null && binding.InputPassword.error == null)
                toastShow(string = getString(R.string.success))
        }
        setContentView(binding.root)
    }

    fun toastShow(string: String) =
        Toast.makeText(applicationContext, string, Toast.LENGTH_SHORT).show()

}
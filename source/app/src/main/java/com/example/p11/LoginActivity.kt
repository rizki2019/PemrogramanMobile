package com.example.p11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.p11.databinding.ActivityLoginBinding

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener { 

            val dataLogin = ModelLogin(binding.txtUser.text.toString(),binding.txtPass.text.toString())
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("data", dataLogin)
            startActivity(intent)
            finish()
        }



    }
}
package com.shopapp.course.screens.welcome.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shopapp.course.R
import com.shopapp.course.databinding.ActivityWelcomeBinding
import com.shopapp.course.helpers.openActivity
import com.shopapp.course.screens.auth.presentation.LoginActivity
import com.shopapp.course.screens.auth.presentation.RegisterActivity

private lateinit var binding: ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.signInBtn.setOnClickListener {
            openActivity(LoginActivity::class.java)
        }
        binding.signUpBtn.setOnClickListener {
            openActivity(RegisterActivity::class.java)
        }
    }
}
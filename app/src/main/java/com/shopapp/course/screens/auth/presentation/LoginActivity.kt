package com.shopapp.course.screens.auth.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.shopapp.course.R
import com.shopapp.course.databinding.ActivityLoginBinding
import com.shopapp.course.databinding.ActivityWelcomeBinding
import com.shopapp.course.helpers.openActivity
import com.shopapp.course.helpers.validateActionBar
import com.shopapp.course.screens.home.presentation.HomeActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validateActionBar(getString(R.string.sign_in))
        binding.signInBtn.setOnClickListener {
            openActivity(HomeActivity::class.java)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
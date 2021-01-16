package com.shopapp.course.screens.splash.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shopapp.course.R
import com.shopapp.course.helpers.openActivity
import com.shopapp.course.screens.welcome.presentation.WelcomeActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
      CoroutineScope(Dispatchers.Main).launch {
          delay(3000)
          openActivity(WelcomeActivity::class.java)
      }

    }
}
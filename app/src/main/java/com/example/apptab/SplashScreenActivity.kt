package com.example.apptab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //hide status bar;
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContentView(R.layout.activity_splash_screen)
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        Handler().postDelayed({
        startActivity(intent) }, SPLASH_TIME_OUT)
    }


}
package com.vanka.laksyam

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(androidx.appcompat.R.style.Theme_AppCompat);
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }
}
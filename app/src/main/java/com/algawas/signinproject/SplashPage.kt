package com.algawas.signinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

/*
Splash Page:
Without toolbar.
Contains logo of the application.
Navigate only if the user long clicked the root view.
 */
class SplashPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_page)
        supportActionBar?.hide() //Wasn't sure if we needed this or the XML one???

        val logo = findViewById<ImageView>(R.id.logo)

        logo.setOnLongClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            //This is needed because setOnLongClickListener is expecting a boolean
            true
        }
    }
}


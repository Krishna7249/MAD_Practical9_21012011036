package com.example.mad_practical9_21012011036

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.WindowCompat

class SplashActivity : AppCompatActivity() {
    lateinit var uvpcelogoanimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val img = findViewById<ImageView>(R.id.uvpce_logo)
        img.setBackgroundResource(R.drawable.uvpce_animation_list)
        uvpcelogoanimation = img.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            uvpcelogoanimation.start()
        }
        else{
            uvpcelogoanimation.stop()
        }
    }
}
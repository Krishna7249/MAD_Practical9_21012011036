package com.example.mad_practical9_21012011036

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation : AnimationDrawable
    lateinit var heartanimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img = findViewById<ImageView>(R.id.animation)
        img.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = img.background as AnimationDrawable
        val animate = findViewById<ImageView>(R.id.heart)
        animate.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = animate.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            alarmanimation.start()
            heartanimation.start()
        }
        else{
            alarmanimation.stop()
            heartanimation.stop()
        }
    }


}
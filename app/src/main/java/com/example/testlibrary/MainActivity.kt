package com.example.testlibrary

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mytestlibrary.BlinkEffect

class MainActivity : AppCompatActivity() {
    private lateinit var customAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button
        myButton = findViewById(R.id.button)

        val myImageView: ImageView = findViewById(R.id.imageView)

        myImageView.apply {
            setBackgroundResource(R.drawable.custom_animation)
            customAnimation = background as AnimationDrawable
        }

        myImageView.setOnClickListener {
            customAnimation.start()
        }

        // Set button alpha to zero
        myButton.setAlpha(0f)
        myButton.setTranslationX(50F)

        // Animate the alpha value to 1f and set duration as 1.5 secs.
        myButton.animate().alpha(1f).translationXBy(-50F).setDuration(1500)

        myButton.setOnClickListener {
            BlinkEffect.blink(myButton, -65281, -12303292)
        }
    }
}

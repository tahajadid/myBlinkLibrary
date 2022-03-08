package com.example.mytestlibrary

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation

object BlinkEffect {

    /**
     * we parse an Int Color Ex: Color.MAGENTA = -65281 || Color.DKGRAY = -12303292
     */
    fun blink(view: View, firstColor: Int, secondColor: Int) {
        // adding the color to be shown
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor", firstColor,
            secondColor
        )

        // duration of one color
        animator.duration = 300
        animator.setEvaluator(ArgbEvaluator())
        // color will be shown in reverse manner
        animator.repeatCount = Animation.REVERSE
        // Repeat up to infinite time
        animator.repeatCount = Animation.INFINITE
        animator.start()
    }
}

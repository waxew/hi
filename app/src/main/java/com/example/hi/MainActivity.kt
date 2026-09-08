package com.example.hi

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        val text = TextView(this).apply {
            text = "سلام"
            textSize = 32f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
        }
        setContentView(text)
    }
}

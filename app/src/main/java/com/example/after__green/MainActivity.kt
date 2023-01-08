package com.example.after__green

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.tv_text)
        var text = "I would #like to do #something similar to the #Twitter app"

        var spanText = SpannableString(text)
        spanText.setSpan(ForegroundColorSpan(Color.GREEN), 8,13,Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        spanText.setSpan(ForegroundColorSpan(Color.GREEN), 20, 30,Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        spanText.setSpan(ForegroundColorSpan(Color.GREEN), 46, 54,Spannable.SPAN_INCLUSIVE_INCLUSIVE)

        textView.text = spanText
    }
}
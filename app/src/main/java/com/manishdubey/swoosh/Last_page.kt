package com.manishdubey.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Last_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)
        val resultText=findViewById<TextView>(R.id.resultText)
        val league=intent.getStringExtra(EXTRA_LEAGUE)
        val skill=intent.getStringExtra(EXTRA_SKILL)
        resultText.text="Looking for $league $skill league near you..."
    }
}
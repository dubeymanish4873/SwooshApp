package com.manishdubey.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1=findViewById<Button>(R.id.btn)
        btn1.setOnClickListener{
            val LeageuIntent=Intent(this,LeagueSelectionLayout::class.java)
            startActivity(LeageuIntent)
        }
    }
}
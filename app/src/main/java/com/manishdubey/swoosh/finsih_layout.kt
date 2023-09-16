package com.manishdubey.swoosh

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton

class finsih_layout : AppCompatActivity() {
  //  lateinit var prev: ImageButton
  private val btn1 by lazy { findViewById<View>(R.id.toggleButton1) as ToggleButton }
    private val btn2 by lazy { findViewById<View>(R.id.toggleButton2) as ToggleButton }
    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finsih_layout)
        val btn=findViewById<Button>(R.id.finishBtn)
        btn1.setOnCheckedChangeListener{_,isChecked->
            if(isChecked){
                btn2.isChecked=false
                skill="beginner"
            }else
            {
                skill=""
            }
        }
        btn2.setOnCheckedChangeListener{_,isChecked->
            if(isChecked){
                btn1.isChecked=false
                skill="bowler"
            }else
            {
                skill=""
            }
        }
        btn.setOnClickListener{
            //league= intent.getStringExtra(EXTRA_LEAGUE).toString()
            if(skill!="")
            {
                val lastIntent= Intent(this,Last_page::class.java)
                lastIntent.putExtra(EXTRA_SKILL,skill)
                startActivity(lastIntent)
            }else{
                Toast.makeText(this,"Please Select the skill",Toast.LENGTH_SHORT).show()
            }

        }
//        prev = findViewById(R.id.back)
//        prev.setOnClickListener{
//            val Intent1=Intent(this,prev::class.java)
//            startActivity(Intent1)
//        }
    }
}
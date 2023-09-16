package com.manishdubey.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton

class LeagueSelectionLayout : AppCompatActivity() {
    var selectedLeague=""
    private val btn1 by lazy { findViewById<View>(R.id.menbtn) as ToggleButton }
    private val btn2 by lazy { findViewById<View>(R.id.womenBtn) as ToggleButton }
    private val btn3 by lazy { findViewById<View>(R.id.co_edbtn) as ToggleButton }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_selection_layout)
        val btn=findViewById<Button>(R.id.nextbtn)
      //  val btn2=findViewById<Button>(R.id.womenBtn)
      //  btn1.setOnClickListener {
            btn1.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    btn2.isChecked = false
                    btn3.isChecked=false
                    selectedLeague="men"
                }else {
                    selectedLeague = ""
                }
            }
       // }
       // btn2.setOnClickListener {
            btn2.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    btn1.isChecked = false
                    btn3.isChecked=false
                    selectedLeague="women"
                }else {
                    selectedLeague = ""
                }
            }
     //   }
      //  btn3.setOnClickListener {
            btn3.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) { //if btn1 is true he is yellow and btn2 is false and he is white
                    btn1.isChecked = false
                    btn2.isChecked=false
                    selectedLeague="coed"
                }else {
                    selectedLeague = ""
                }
        //  }
        }

       // val btn2=findViewById<Button>(R.id.womenBtn)
      //  ToggleButton togbtn=(ToggleButton)findViewById<Button>(R.id.menbtn)
//        fun onMenClicked(view: View)
//        {
//         //   btn2.isClickable=false
//
//        }
//        fun onWomenClicked(view:View)
//        {
//            btn1.isClickable=false
//
//        }
        btn.setOnClickListener{
            if(selectedLeague !="") {
                val Intent2 = Intent(this, finsih_layout::class.java)
                //Intent2.putExtra(EXTRA_LEAGUE,selectedLeague)
                Intent2.putExtra(EXTRA_LEAGUE,selectedLeague)
                startActivity(Intent2)
            }else
            {
                Toast.makeText(this,"Please Select a league.",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
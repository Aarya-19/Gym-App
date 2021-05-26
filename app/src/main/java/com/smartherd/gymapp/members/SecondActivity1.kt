package com.smartherd.gymapp.members

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.gymapp.MainActivity
import com.smartherd.gymapp.*
import kotlinx.android.synthetic.main.activity_members.*

class SecondActivity1 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members)

        btnab.setOnClickListener {
            val intent = Intent(this, ABM::class.java)
            startActivity(intent)
        }
        btnag.setOnClickListener {
            val intent = Intent(this, AGM::class.java)
            startActivity(intent)
        }
        btnsak.setOnClickListener {
            val intent = Intent(this, SAKM::class.java)
            startActivity(intent)
        }
        btnaddm.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
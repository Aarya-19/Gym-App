package com.smartherd.gymapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.smartherd.gymapp.members.SecondActivity1
import com.smartherd.gymapp.staff.StaffActivity
import kotlinx.android.synthetic.main.activity_main1.*

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        btnstaff.setOnClickListener {
            Toast.makeText(this, "Staff was Clicked ! ", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, StaffActivity::class.java)
            startActivity(intent)
        }

        btnmembers.setOnClickListener {
            Toast.makeText(this, "Members was Clicked ! ", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, SecondActivity1::class.java)
            startActivity(intent)
        }
    }
}
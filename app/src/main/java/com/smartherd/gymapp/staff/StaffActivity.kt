package com.smartherd.gymapp.staff

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.gymapp.R
import kotlinx.android.synthetic.main.activity_staff.*

class StaffActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff)

        btnabs.setOnClickListener {
            val intent = Intent(this, ABS::class.java)
            startActivity(intent)
        }
        btnags.setOnClickListener {
            val intent = Intent(this, AGS::class.java)
            startActivity(intent)
        }
        btnsaks.setOnClickListener {
            val intent =Intent(this, SAKS::class.java)
            startActivity(intent)
        }
        btnadds.setOnClickListener {
            val intetnt = Intent(this, ADDS::class.java)
            startActivity(intent)
        }
    }
}
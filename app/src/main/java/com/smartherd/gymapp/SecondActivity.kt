package com.smartherd.gymapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.gymapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        val msg2 = bundle!!.getString("user_message2")
        val msg3 = bundle!!.getString("user_message3")
        val msg4 = bundle!!.getString("user_message4")
        val msg5 = bundle!!.getString("user_message5")
        val msg6 = bundle!!.getString("user_message6")

        //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        textView.text = "Admit Name: " + msg
        textView3.text = "Age of " + msg + " is: "+ msg2
        textView9.text = "Weight : "+ msg3
        textView8.text = "Height : " + msg4
        textView10.text = "City name : "+ msg5
        textView11.text = "State name : " + msg6
    }
}


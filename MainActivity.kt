package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclickme = findViewById<Button>(R.id.mybutton)
        val tvMytextView = findViewById<TextView>(R.id.textView)
        var timesclicked =0
        btnclickme.setOnClickListener {
            timesclicked = timesclicked + 1

            tvMytextView.text = timesclicked.toString()
            Toast.makeText(this,"hi divyansh!",Toast.LENGTH_LONG).show()
        }
    }
}




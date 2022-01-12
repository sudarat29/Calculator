package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var i = num1.text.toString()
            var j = num2.text.toString()
            if(i.isEmpty() || j.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView6.text = "+"
            textView7.text = (i.toDouble() + j.toDouble()).toString()
        }
        button2.setOnClickListener {
            var i = num1.text.toString()
            var j = num2.text.toString()
            if(i.isEmpty() || j.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView6.text = "-"
            textView7.text = (i.toDouble() - j.toDouble()).toString()
        }
        button3.setOnClickListener {
            var i = num1.text.toString()
            var j = num2.text.toString()
            if(i.isEmpty() || j.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView6.text = "*"
            textView7.text = (i.toDouble() * j.toDouble()).toString()
        }
        button4.setOnClickListener {
            var i = num1.text.toString()
            var j = num2.text.toString()
            if(i.isEmpty() || j.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            if (i.toDouble() == 0.0)
                return@setOnClickListener Toast.makeText(this@MainActivity,"Do not NUM2 is ZERO or NULL", Toast.LENGTH_SHORT).show()
            textView6.text = "/"
            textView7.text = (i.toDouble() / j.toDouble()).toString()
        }
        button5.setOnClickListener {
            var i = num1.text.toString()
            var j = num2.text.toString()
            if(i.isEmpty() || j.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            if (i.toDouble() == 0.0)
                return@setOnClickListener Toast.makeText(this@MainActivity,"Do not NUM2 is ZERO or NULL", Toast.LENGTH_SHORT).show()
            textView6.text = "%"
            textView7.text = (i.toDouble() % j.toDouble()).toString()
        }
        button6.setOnClickListener {
            num1.text.clear()
            num2.text.clear()
            textView6.text = " "
            textView7.text = " "

        }
    }
}
package com.app.first.first_kotlin_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
    }

    fun pressButtonAction(view:View){
        val textViewText = textView.text.toString()
        val button = view as Button
        val buttonText = button.text
        textView.text = buttonText
        Log.d("MainActivity",textViewText)
    }
}

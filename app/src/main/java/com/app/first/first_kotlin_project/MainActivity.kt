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
//        val textViewText = textView.text.toString()
//        val button = view as Button
//        val buttonText = button.text
//        textView.text = buttonText
//        Log.d("MainActivity",textViewText)
//
//
//        var isDoorOpen:Boolean = false
//        var currentMonthDays: Int = 31
//        val days:String = currentMonthDays.toString()
//        val currMonthDaysString:String = "28"
//        currentMonthDays = currMonthDaysString.toInt()
//
//        Log.d("MainActivity",currentMonthDays.toString())
        fuzzBizz()


    }

    fun collectionAction(view:View) {
        val weekDays = listOf<String>("Saturday", "Sunday", "Monday", "Tuesday", "Wedensday", "Thursday")
        var currentMonth = arrayOf<Int>(1,2,4,5,6,7,8,9)
        var trueOrFalseArrray = booleanArrayOf()
        Log.d("MainActivity",weekDays.get(2))
    }

    fun fuzzBizz(){
        var current: Int = 0
        var remainderOfThree : Int
        var remainderOfFive : Int

        while (current <= 100){
            current += 1
            remainderOfThree = current.rem(3)
            remainderOfFive = current.rem(5)
            if (remainderOfThree == 0 && remainderOfFive == 0){
                Log.d("MainActivity","FizzBuzz " + current.toString())
            } else if (remainderOfThree == 0 && remainderOfFive != 0){
                Log.d("MainActivity","Fizz " + current.toString())

            } else if (remainderOfThree != 0 && remainderOfFive == 0) {
                Log.d("MainActivity","Buzz " + current.toString())
            }
        }
    }


}

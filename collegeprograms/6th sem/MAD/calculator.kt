/*MainActivity.kt*/


package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    var digit = StringBuilder()
    var operataion: Char = ' '
    var lhs: Double = 0.0
    var rhs: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayRes.text = ""

        buttonStart()
    }

    private fun buttonStart(){
        numberButton()
        operationButton()
        functionButton()
    }

    private fun numberButton(){
        zeroButton.setOnClickListener{
            appendToResult("0")
        }
        oneButton.setOnClickListener{
            appendToResult("1")
        }
        twoButton.setOnClickListener{
            appendToResult("2")
        }
        threeButton.setOnClickListener{
            appendToResult("3")
        }
        fourButton.setOnClickListener{
            appendToResult("4")
        }
        fiveButton.setOnClickListener{
            appendToResult("5")
        }
        sixButton.setOnClickListener{
            appendToResult("6")
        }
        sevenButton.setOnClickListener{
            appendToResult("7")
        }
        eightButton.setOnClickListener{
            appendToResult("8")
        }
        nineButton.setOnClickListener{
            appendToResult("9")
        }
        decimalButton.setOnClickListener{
            appendToResult(".")
        }
    }

    private fun operationButton(){
        addButton.setOnClickListener{
            signView.text= "+"
            selectOperation('A')
        }
        subtractButton.setOnClickListener{
            signView.text= "-"
            selectOperation('S')
        }
        productButton.setOnClickListener{
            signView.text= "*"
            selectOperation('M')
        }
        divideButton.setOnClickListener{
            signView.text= "/"
            selectOperation('D')
        }
    }

    private fun functionButton()
    {
        clearButton.setOnClickListener{
            clearScreen()
        }
        equalButton.setOnClickListener{
            if (displayRes.text == "")
            {
            }
            else
            {
                doMath()
            }
        }
    }

    private fun appendToResult(s:String)
    {
        digit.append(s)
        displayRes.text = digit.toString()
    }

    private fun selectOperation(c:Char)
    {
        operataion = c
        lhs = digit.toString().toDouble()
        digit.clear()
    }

    private fun doMath()
    {
        rhs = digit.toString().toDouble()
        digit.clear()
        when(operataion){
            'A' -> {
                val x = MathHelper.add(lhs, rhs)
                displayRes.text = x.toString()
                digit.append(x)
            }
            'S' -> {
                val x = MathHelper.sub(lhs, rhs)
                displayRes.text = x.toString()
                digit.append(x)
            }
            'M' -> {
                val x = MathHelper.mul(lhs, rhs)
                displayRes.text = x.toString()
                digit.append(x)
            }
            'D' -> {
                val x = MathHelper.div(lhs, rhs)
                displayRes.text = x.toString()
                digit.append(x)
            }
        }
        signView.text=""
    }

    private fun clearScreen()
    {
        try {
            val l = digit.length
            digit.deleteCharAt(l-1)
            displayRes.text = digit.toString()
        }
        catch(e:Exception){
            appendToResult("")
        }
    }
}

class MathHelper
{
    companion object{
        fun add(lhs:Double, rhs:Double):Double{
            return lhs + rhs
        }
        fun sub(lhs:Double, rhs:Double):Double{
            return lhs - rhs
        }
        fun mul(lhs:Double, rhs:Double):Double{
            return lhs * rhs
        }
        fun div(lhs:Double, rhs:Double):Double{
            return lhs / rhs
        }
    }
}
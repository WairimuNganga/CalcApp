package dev.wairimu.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tvAns: TextView
    lateinit var tilNumber1 :TextInputLayout
    lateinit var tilNumber2 :TextInputLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivide=findViewById(R.id.btnDivide)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        tvAns=findViewById(R.id.tvAns)
        tilNumber1 = findViewById(R.id.tilNumber1)
        tilNumber2 = findViewById(R.id.tilNumber2)

        var number1 = etNumber1.text.toString()
        var number2 = etNumber2.text.toString()

        btnAdd.setOnClickListener{
            tvAns.text="Answer"
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter your first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter your second number")
                return@setOnClickListener
            }
            add(number1.toDouble(),number2.toDouble())
        }

        btnSubtract.setOnClickListener{
            tvAns.text="Answer"
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter your first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter your second number")
                return@setOnClickListener
            }
            subtract(number1.toDouble(),number2.toDouble())
        }
        btnMultiply.setOnClickListener{
            tvAns.text="Answer"
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter your first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter your second number")
                return@setOnClickListener
            }
            multiply(number1.toDouble(),number2.toDouble())
        }
        btnDivide.setOnClickListener{
            tvAns.text="Answer"
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter your first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter your second number")
                return@setOnClickListener
            }
            division(number1.toDouble(),number2.toDouble())
        }
    }
    fun add(number1:Double,number2:Double){
        var sum = number1+number2
        tvAns.text=sum.toString()
    }
    fun subtract(number1:Double,number2:Double) {
        var subtraction = number1 - number2
        tvAns.text = subtraction.toString()
    }
    fun multiply(number1:Double,number2:Double) {
        var multiplication = number1 * number2
        tvAns.text = multiplication.toString()
    }
    fun division(number1:Double,number2:Double) {
        var divison = number1 / number2
        tvAns.text = divison.toString()
    }


}
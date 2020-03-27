package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateBtn.setOnClickListener {
            if(inputValueET.text.isEmpty() || inputValueET.text.isNullOrBlank()){
                show("Please enter a valid number")
            }else{
                val inputValue = inputValueET.text.toString().toFloat()

                if(celsiusBtn.isChecked){
                    inputValueET.setText(ConverterUtil.convertFahrenheitToCelsius(inputValue).toString())
                    celsiusBtn.isChecked = false
                    fahrenheitBtn.isChecked = true
                } else {
                    inputValueET.setText(ConverterUtil.convertCelsiusToFahrenheit(inputValue).toString())
                    fahrenheitBtn.isChecked = false
                    celsiusBtn.isChecked = true
                }
            }
        }

    }
}

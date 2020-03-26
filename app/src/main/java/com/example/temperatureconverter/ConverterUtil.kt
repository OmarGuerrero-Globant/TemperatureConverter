package com.example.temperatureconverter

class ConverterUtil {

    companion object{
        fun convertFahrenheitToCelsius(fahrenheit : Float) : Float  =
            ((fahrenheit -32)*5 /9)

        fun convertCelsiusToFahrenheit(celsius: Float) =
            ((celsius * 9) / 5) +32
    }

}
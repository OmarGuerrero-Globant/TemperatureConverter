package com.example.temperatureconverter

import android.content.Context
import android.widget.Toast


fun Context.show(message: String, length: Int = Toast.LENGTH_LONG){
    Toast.makeText(this, message, length).show()
}
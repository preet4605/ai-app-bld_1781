package com.generated.app.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    var currentNumber by mutableStateOf("")
    var previousNumber by mutableStateOf("")
    var operation by mutableStateOf("")

    fun onNumberPressed(number: String) {
        currentNumber += number
    }

    fun onOperationPressed(op: String) {
        previousNumber = currentNumber
        operation = op
        currentNumber = ""
    }

    fun onEqualsPressed() {
        val previous = previousNumber.toDouble()
        val current = currentNumber.toDouble()

        when (operation) {
            "+" -> currentNumber = (previous + current).toString()
            "-" -> currentNumber = (previous - current).toString()
            "*" -> currentNumber = (previous * current).toString()
            "/" -> currentNumber = (previous / current).toString()
        }
    }

    fun onClearPressed() {
        currentNumber = ""
        previousNumber = ""
        operation = ""
    }
}
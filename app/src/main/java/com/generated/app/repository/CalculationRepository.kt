package com.generated.app.repository

class CalculationRepository {
    fun calculate(number1: Double, number2: Double, operation: String): Double {
        return when (operation) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> number1 / number2
            else -> 0.0
        }
    }
}
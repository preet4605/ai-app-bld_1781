package com.generated.app.repository

class UnitConversionRepository {
    fun convertLength(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit) {
            "m" -> when (toUnit) {
                "cm" -> value * 100
                "mm" -> value * 1000
                "km" -> value / 1000
                else -> value
            }
            "cm" -> when (toUnit) {
                "m" -> value / 100
                "mm" -> value * 10
                "km" -> value / 100000
                else -> value
            }
            "mm" -> when (toUnit) {
                "m" -> value / 1000
                "cm" -> value / 10
                "km" -> value / 1000000
                else -> value
            }
            "km" -> when (toUnit) {
                "m" -> value * 1000
                "cm" -> value * 100000
                "mm" -> value * 1000000
                else -> value
            }
            else -> value
        }
    }

    fun convertWeight(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit) {
            "kg" -> when (toUnit) {
                "g" -> value * 1000
                "mg" -> value * 1000000
                else -> value
            }
            "g" -> when (toUnit) {
                "kg" -> value / 1000
                "mg" -> value * 1000
                else -> value
            }
            "mg" -> when (toUnit) {
                "kg" -> value / 1000000
                "g" -> value / 1000
                else -> value
            }
            else -> value
        }
    }
}
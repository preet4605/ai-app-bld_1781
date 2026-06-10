package com.generated.app.ui.theme
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp

val fonts = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

val h1: TextStyle
    get() = TextStyle(
        fontFamily = fonts,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )

val h2: TextStyle
    get() = TextStyle(
        fontFamily = fonts,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        color = Color.Black
    )

val body1: TextStyle
    get() = TextStyle(
        fontFamily = fonts,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )

val body2: TextStyle
    get() = TextStyle(
        fontFamily = fonts,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
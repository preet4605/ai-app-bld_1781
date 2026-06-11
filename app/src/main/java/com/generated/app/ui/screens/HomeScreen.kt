package com.generated.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.generated.app.ui.components.CustomButton
import com.generated.app.ui.theme.AppTheme

@Composable
fun HomeScreen() {
    AppTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            CustomButton(
                onClick = { /* Handle button click */ },
                text = "Click me"
            )
            Text(text = "Welcome to the home screen")
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
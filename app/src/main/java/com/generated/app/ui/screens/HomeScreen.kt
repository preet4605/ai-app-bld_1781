package com.generated.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.generated.app.ui.theme.Type

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Welcome to the Modern Gallery App",
            style = Type.h1
        )

        Text(
            text = "This app is designed to provide a clean and responsive interface for viewing and managing your image gallery.",
            style = Type.body1,
            modifier = Modifier.padding(top = 16.dp)
        )

        Button(
            onClick = { /* Add button click handler */ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = "Explore Gallery",
                style = Type.body2
            )
        }
    }
}
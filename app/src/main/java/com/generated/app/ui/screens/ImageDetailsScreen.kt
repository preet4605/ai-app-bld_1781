package com.generated.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.generated.app.ui.theme.Type

@Composable
fun ImageDetailsScreen(
    imageResId: Int,
    imageTitle: String,
    imageDescription: String,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Back Button
        Button(
            onClick = onBackClick,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Text(
                text = "Back",
                style = Type.body2
            )
        }

        // Image Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Image Title
        Text(
            text = imageTitle,
            style = Type.h1,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Image Description
        Text(
            text = imageDescription,
            style = Type.body1,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
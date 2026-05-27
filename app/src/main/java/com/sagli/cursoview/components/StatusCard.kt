package com.sagli.cursoview.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StatusCard(
    message: String
) {

    val isSuccess =
        message == "Cadastro válido."

    val containerColor =
        if (isSuccess) {
            Color(0xFFDFF5E1)
        } else {
            Color(0xFFFFE0E0)
        }

    val textColor =
        if (isSuccess) {
            Color(0xFF1B5E20)
        } else {
            Color(0xFFB00020)
        }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {

        Text(
            text = message,

            color = textColor,

            modifier = Modifier.padding(16.dp)
        )
    }
}
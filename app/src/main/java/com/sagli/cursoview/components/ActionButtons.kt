package com.sagli.cursoview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ActionButtons(
    onValidateClick: () -> Unit,
    onClearClick: () -> Unit,
    onExampleClick: () -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        horizontalArrangement =
            Arrangement.SpaceEvenly
    ) {

        Button(
            onClick = onValidateClick
        ) {
            Text("Validar")
        }

        Button(
            onClick = onExampleClick
        ) {
            Text("Exemplo")
        }

        Button(
            onClick = onClearClick
        ) {
            Text("Limpar")
        }
    }
}
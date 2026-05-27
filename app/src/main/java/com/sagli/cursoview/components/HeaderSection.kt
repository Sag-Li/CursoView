package com.sagli.cursoview.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeaderSection() {

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(
            text = "Cadastro Visual de Cursos"
        )

        Text(
            text = "Monte a apresentação inicial de um curso técnico."
        )
    }
}
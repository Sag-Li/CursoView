package com.sagli.cursoview.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight
@Composable
fun CoursePreviewCard(
    fullName: String,
    shortName: String,
    category: String,
    workload: String,
    description: String
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F8FF)
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = "Pré-visualização",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0A4D8C)
            )

            Text(
                text = if (shortName.isBlank())
                    "Nome breve não informado"
                else
                    shortName
            )

            Text(
                text = if (fullName.isBlank())
                    "Nome completo não informado"
                else
                    fullName
            )

            Text(
                text = if (category.isBlank())
                    "Categoria não informada"
                else
                    category
            )

            Text(
                text = if (workload.isBlank())
                    "Carga horária não informada"
                else
                    "$workload horas"
            )

            Text(
                text = if (description.isBlank())
                    "Descrição não informada"
                else
                    description
            )
        }
    }
}
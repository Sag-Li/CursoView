package com.sagli.cursoview.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CourseForm(
    fullName: String,
    onFullNameChange: (String) -> Unit,

    shortName: String,
    onShortNameChange: (String) -> Unit,

    category: String,
    onCategoryChange: (String) -> Unit,

    workload: String,
    onWorkloadChange: (String) -> Unit,

    description: String,
    onDescriptionChange: (String) -> Unit
) {

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        OutlinedTextField(
            value = fullName,
            onValueChange = onFullNameChange,

            label = {
                Text("Nome completo do curso")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = shortName,
            onValueChange = onShortNameChange,

            label = {
                Text("Nome breve")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = category,
            onValueChange = onCategoryChange,

            label = {
                Text("Categoria")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = workload,
            onValueChange = onWorkloadChange,

            label = {
                Text("Carga horária")
            },

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = description,
            onValueChange = onDescriptionChange,

            label = {
                Text("Descrição curta")
            },

            modifier = Modifier.fillMaxWidth()
        )
    }
}
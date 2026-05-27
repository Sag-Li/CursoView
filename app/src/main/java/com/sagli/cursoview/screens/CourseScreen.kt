package com.sagli.cursoview.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import com.sagli.cursoview.components.CourseForm
import com.sagli.cursoview.components.HeaderSection
import com.sagli.cursoview.components.CoursePreviewCard
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import com.sagli.cursoview.components.StatusCard

@Composable
fun CourseScreen() {

    var fullName by remember { mutableStateOf("") }
    var shortName by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var workload by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Scaffold { paddingValues ->

        Column(modifier = Modifier.padding(paddingValues)
        ) {

            HeaderSection()

            CourseForm(
                fullName = fullName,
                onFullNameChange = {
                    fullName = it
                },

                shortName = shortName,
                onShortNameChange = {
                    shortName = it
                },

                category = category,
                onCategoryChange = {
                    category = it
                },

                workload = workload,
                onWorkloadChange = {
                    workload = it
                },

                description = description,
                onDescriptionChange = {
                    description = it
                }
            )
            CoursePreviewCard(
                fullName = fullName,
                shortName = shortName,
                category = category,
                workload = workload,
                description = description
            )
            StatusCard(
                message = "Preencha todos os dados para avançar."
            )
        }
    }
}
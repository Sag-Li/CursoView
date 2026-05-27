package com.sagli.cursoview.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import com.sagli.cursoview.components.CourseForm
import com.sagli.cursoview.components.HeaderSection

@Composable
fun CourseScreen() {

    var fullName by remember { mutableStateOf("") }
    var shortName by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var workload by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Scaffold { paddingValues ->

        Column {

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
        }
    }
}
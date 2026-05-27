package com.sagli.cursoview.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.sagli.cursoview.components.ActionButtons
import com.sagli.cursoview.components.CourseForm
import com.sagli.cursoview.components.CoursePreviewCard
import com.sagli.cursoview.components.HeaderSection
import com.sagli.cursoview.components.StatusCard
import com.sagli.cursoview.model.CourseUiState
import com.sagli.cursoview.validation.CourseValidator

@Composable
fun CourseScreen() {

    var fullName by remember {
        mutableStateOf("")
    }

    var shortName by remember {
        mutableStateOf("")
    }

    var category by remember {
        mutableStateOf("")
    }

    var workload by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    var statusMessage by remember {
        mutableStateOf(
            "Preencha todos os dados para avançar."
        )
    }

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
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

            ActionButtons(

                onValidateClick = {

                    val course = CourseUiState(
                        fullName = fullName,
                        shortName = shortName,
                        category = category,
                        workload = workload,
                        description = description
                    )

                    val result =
                        CourseValidator.validate(course)

                    statusMessage = result.message
                },

                onClearClick = {

                    fullName = ""
                    shortName = ""
                    category = ""
                    workload = ""
                    description = ""

                    statusMessage =
                        "Preencha todos os dados para avançar."
                },

                onExampleClick = {

                    fullName =
                        "Técnico em Desenvolvimento de Sistemas"

                    shortName = "Dev Systems"

                    category = "Tecnologia"

                    workload = "120"

                    description =
                        "Curso focado em programação e desenvolvimento de software."

                    statusMessage =
                        "Exemplo carregado com sucesso."
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
                message = statusMessage
            )
        }
    }
}
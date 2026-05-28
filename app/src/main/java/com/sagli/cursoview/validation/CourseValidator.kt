package com.sagli.cursoview.validation

import com.sagli.cursoview.model.CourseUiState

object CourseValidator {

    fun validate(
        course: CourseUiState
    ): ValidationResult {


        if (course.fullName.isBlank()) {
            return ValidationResult(
                false,
                "Informe o nome completo do curso."
            )
        }

        if (course.fullName.length < 10) {
            return ValidationResult(
                false,
                "O nome completo deve ter pelo menos 10 caracteres."
            )
        }

        if (course.shortName.isBlank()) {
            return ValidationResult(
                false,
                "Informe o nome breve."
            )
        }

        if (course.shortName.length < 3) {
            return ValidationResult(
                false,
                "O nome breve deve ter pelo menos 3 caracteres."
            )
        }

        if (course.category.isBlank()) {
            return ValidationResult(
                false,
                "Informe a categoria."
            )
        }

        if (course.category.any { it.isDigit() }) {
            return ValidationResult(
                false,
                "A categoria não pode conter números."
            )
        }

        if (course.workload.isBlank()) {
            return ValidationResult(
                false,
                "Informe a carga horária."
            )
        }

        val workloadValue =
            course.workload.toIntOrNull()

        if (workloadValue == null) {
            return ValidationResult(
                false,
                "A carga horária deve conter apenas números."
            )
        }

        if (workloadValue <= 0) {
            return ValidationResult(
                false,
                "A carga horária deve ser maior que zero."
            )
        }

        if (course.description.isBlank()) {
            return ValidationResult(
                false,
                "Informe a descrição."
            )
        }

        if (course.description.length < 15) {
            return ValidationResult(
                false,
                "A descrição deve ter pelo menos 15 caracteres."
            )
        }

        return ValidationResult(
            true,
            "Cadastro válido."
        )
    }
}
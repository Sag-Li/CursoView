package com.sagli.cursoview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sagli.cursoview.screens.CourseScreen
import com.sagli.cursoview.ui.theme.CursoViewTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CursoViewTheme {
                CourseScreen()
            }
        }
    }
}
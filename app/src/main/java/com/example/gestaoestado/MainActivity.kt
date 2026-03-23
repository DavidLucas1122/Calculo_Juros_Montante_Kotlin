package com.example.gestaoestado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.gestaoestado.juros.JurosScreen
import com.example.gestaoestado.juros.JurosScreenViewModel
import com.example.gestaoestado.ui.theme.GestaoEstadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestaoEstadoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   JurosScreen(
                       modifier = Modifier.padding(innerPadding),
                       jurosScreenViewModel = JurosScreenViewModel()
                   )
                }
            }
        }
    }
}



package com.example.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.a20octubre.ui.theme._20OctubreTheme
import com.example.composable.ui.screen.LoginScreen
import com.example.composable.ui.screen.RegistroScreen
import com.example.composable.ui.screen.RecuperarScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _20OctubreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // LoginScreen()
                    // RegistroScreen()
                    RecuperarScreen()
                }
            }
        }
    }
}

package com.example.tarjeta_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta_presentacion.ui.theme.Tarjeta_PresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarjeta_PresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        presentacion(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun presentacion(modifier: Modifier= Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        imagen()
        Text(text = "katherine villca", color = Color.Red, fontSize = 24.sp)
        Text(text = "Estudiante", color = Color.Gray)
        Text(text = "k.villca2@alumnos.santotomas.cl", color = Color.Black)
        Text(text = "111111111", color = Color.Black)
    }
}

@Composable
fun imagen() {
    Image(
        painter = painterResource(id = R.drawable.imagen),
        contentDescription = null,
        modifier = Modifier.size(100.dp)
    )
}


@Preview(showBackground = true)

@Composable
fun GreetingPreview() {
    Tarjeta_PresentacionTheme {
        presentacion()
    }
}
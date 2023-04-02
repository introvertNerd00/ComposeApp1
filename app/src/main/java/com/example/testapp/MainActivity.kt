package com.example.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testapp.ui.theme.TestAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =Arrangement.Center,
        modifier = Modifier.background(Color.Cyan)) {
        Text(
            text = "Hello $name!",
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.LineThrough
        )
        Text(
            text = "Hello Hamza",
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.LineThrough
        )
    }

}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun DefaultPreview() {
    TestAppTheme {
        Greeting("Android")
    }
}
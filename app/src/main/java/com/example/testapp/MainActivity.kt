package com.example.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testapp.ui.theme.TestAppTheme


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
                    BirthdayGreetingWithImage( message = "Happy Birthday Hashaam!", from = "- from Hamza")
                }
            }
        }
    }
}



@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(id = R.drawable.androidparty)

    Box{
        Image(painter = image, contentDescription = null , modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(message = "Happy Birthday Hashaam!", from ="- from Hamza")
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = message,
            fontSize = 34.sp,
            modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp ,top=10.dp )
        )
        Text(
            text = from,
            fontSize = 24.sp,
            textAlign = TextAlign.Right
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardImagePreview() {
    TestAppTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Hashaam!", from ="- from Hamza")
    }
}
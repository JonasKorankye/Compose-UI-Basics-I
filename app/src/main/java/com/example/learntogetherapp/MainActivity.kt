package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

/**
 * Created by Jonas 10/10/2023
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogether(
                        messageHeader = stringResource(R.string.message_header),
                        messageIntro = stringResource(R.string.message_intro),
                        messageBody = stringResource(R.string.message_body)
                    )
                }
            }
        }
    }
}


@Composable
fun LearnTogether(
    messageHeader: String,
    messageIntro: String,
    messageBody: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        val image = painterResource(R.drawable.bg_compose_background)

        Image(
            painter = image,
            contentScale = ContentScale.FillWidth,
            contentDescription = null
        )
        Text(
            text = messageHeader,
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )

        Text(
            text = messageIntro,
            modifier = modifier.padding(16.dp, 0.dp, 16.dp, 0.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = messageBody,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }


}
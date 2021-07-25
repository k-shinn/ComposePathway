package com.kei.compose_pathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kei.compose_pathway.ui.theme.ComposePathwayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePathwayTheme {
                LayoutCodeLab()
            }
        }
    }
}

@Composable
fun LayoutCodeLab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Layout Codelab")
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                })
        }
    ) { innerPadding ->
        BodyContent(
            Modifier
                .padding(innerPadding)
                .padding(8.dp)
        )
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!!")
        Text(text = "Thanks for going through the Layouts codelab.")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePathwayTheme {
        LayoutCodeLab()
    }
}

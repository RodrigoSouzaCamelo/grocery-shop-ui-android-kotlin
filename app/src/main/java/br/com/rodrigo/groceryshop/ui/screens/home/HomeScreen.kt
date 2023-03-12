package br.com.rodrigo.groceryshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.rodrigo.groceryshop.R
import br.com.rodrigo.groceryshop.ui.screens.home.AppBar
import br.com.rodrigo.groceryshop.ui.screens.home.Content

@Composable
fun HomeScreen() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.bg_main),
            contentDescription = "Header Background",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth().offset(0.dp, (-30).dp)
        )

        Scaffold(
            topBar = { AppBar() },
            backgroundColor = Color.Transparent
        ) { paddingValues ->
            Content(paddingValues)
        }
    }
}
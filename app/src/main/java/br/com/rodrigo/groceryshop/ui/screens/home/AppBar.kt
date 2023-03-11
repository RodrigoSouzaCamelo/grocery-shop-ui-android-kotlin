package br.com.rodrigo.groceryshop.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .padding(16.dp)
            .height(48.dp)
    ) {
        TextField(
            value = "",
            onValueChange = {},
            singleLine = true,
            shape = RoundedCornerShape(8.dp),
            label = {
                Text(
                    text = "Search Food, Vegetable, etc.",
                    fontSize = 12.sp
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "Search"
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )

        Spacer(modifier = Modifier.width(8.dp))

        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "")
        }
    }
}
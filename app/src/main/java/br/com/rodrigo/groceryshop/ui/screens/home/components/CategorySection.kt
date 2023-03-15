package br.com.rodrigo.groceryshop.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rodrigo.groceryshop.R
import br.com.rodrigo.groceryshop.ui.theme.GroceryShopTheme

@Composable
fun CategorySection() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Category", style = MaterialTheme.typography.h6)
            TextButton(onClick = {}) {
                Text(text = "More", color = MaterialTheme.colors.primary)
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            CategoryButton(
                text = "Fruits",
                icon = painterResource(R.drawable.ic_orange),
                backgroundColor = Color(0xFFFEF4E7)
            )

            CategoryButton(
                text = "Vegetables",
                icon = painterResource(R.drawable.ic_veg),
                backgroundColor = Color(0xFFFEF4E7)
            )

            CategoryButton(
                text = "Dairy",
                icon = painterResource(R.drawable.ic_cheese),
                backgroundColor = Color(0xFFFEF4E7)
            )

            CategoryButton(
                text = "Meats",
                icon = painterResource(R.drawable.ic_meat),
                backgroundColor = Color(0xFFFEF4E7)
            )
        }
    }
}

@Composable
fun CategoryButton(
    text: String = "",
    icon: Painter,
    backgroundColor: Color
) {
    Column(
        modifier = Modifier
            .width(64.dp)
            .clickable { }
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(12.dp)
                ).padding(18.dp)
        ) {
            Image(painter = icon, contentDescription = null)
        }

        Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategorySectionPreview() {
    GroceryShopTheme {
        CategorySection()
    }
}
package br.com.rodrigo.groceryshop.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rodrigo.groceryshop.R
import br.com.rodrigo.groceryshop.ui.theme.GroceryShopTheme

@Composable
fun Promotions() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.height(160.dp)
    ) {
        item {
            PromotionItem(
                title = "Fruit",
                subtitle = "Start @",
                header = "$1",
                backgroundColor = MaterialTheme.colors.primary,
                imagePainter = painterResource(R.drawable.promotion)
            )

        }

        item {
            PromotionItem(
                title = "Meat",
                subtitle = "Discount",
                header = "20%",
                backgroundColor = Color(0xFF6EB6F5),
                imagePainter = painterResource(R.drawable.promotion)
            )
        }
    }
}

@Composable
fun PromotionItem(
    title: String = "",
    subtitle: String = "",
    header: String = "",
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp,
        modifier = Modifier.width(300.dp)
    ) {
        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight()
            ) {
                Text(text = title, fontSize = 14.sp, color = Color.White)

                Text(
                    text = subtitle,
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = header,
                    fontSize = 28.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(
                painter = imagePainter,
                contentDescription = "",
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun PromotionsPreview() {
    GroceryShopTheme {
        Promotions()
    }
}
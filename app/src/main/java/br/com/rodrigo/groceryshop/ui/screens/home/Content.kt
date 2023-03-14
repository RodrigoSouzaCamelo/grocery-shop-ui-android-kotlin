package br.com.rodrigo.groceryshop.ui.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rodrigo.groceryshop.R
import br.com.rodrigo.groceryshop.ui.components.VerticalDivider
import br.com.rodrigo.groceryshop.ui.screens.home.components.CategorySection
import br.com.rodrigo.groceryshop.ui.screens.home.components.Promotions
import br.com.rodrigo.groceryshop.ui.theme.GroceryShopTheme

@Composable
fun Content(paddingValues: PaddingValues) {
    Column(modifier = Modifier.padding(paddingValues)) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        Promotions()
        Spacer(modifier = Modifier.height(16.dp))
        CategorySection()
    }
}

@Composable
fun Header() {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .height(64.dp)
            .padding(horizontal = 16.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            QrButton()
            VerticalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable {  }
                    .padding(horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_money),
                    contentDescription = "",
                    tint = Color(0xFF6FCF97)
                )

                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "$120", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Top Up", color = MaterialTheme.colors.primary, fontSize = 12.sp)
                }
            }

            VerticalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable {  }
                    .padding(horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_coin),
                    contentDescription = "",
                    tint = MaterialTheme.colors.primary
                )

                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "$10", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text(text = "Points", color = Color.LightGray, fontSize = 12.sp)
                }
            }
        }
    }
}

@Composable
fun QrButton(){
    IconButton(
        onClick = {},
        modifier = Modifier
            .fillMaxHeight()
            .aspectRatio(1f)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_scan),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Preview
@Composable
fun ContentPreview() {
    GroceryShopTheme {
        Content(PaddingValues())
    }
}
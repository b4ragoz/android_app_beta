package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import androidx.compose.ui.res.painterResource


@Composable
fun HeroDetailScreen(heroName: String, navController: NavController) {
    val hero = DataProvider.heroes.find { it.name == heroName }
    hero?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = hero.detailImageRes),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(300.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = it.name, style = MaterialTheme.typography.h4)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = it.description)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigateUp() }) {
                Text("Назад")
            }
        }
    }
}

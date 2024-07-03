package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") { HeroListScreen(navController) }
        composable("detail/{heroName}") { backStackEntry ->
            HeroDetailScreen(backStackEntry.arguments?.getString("heroName") ?: "", navController)
        }
    }
}
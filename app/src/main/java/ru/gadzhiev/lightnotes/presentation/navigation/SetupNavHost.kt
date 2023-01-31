package ru.gadzhiev.lightnotes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.gadzhiev.lightnotes.presentation.screens.AddScreen
import ru.gadzhiev.lightnotes.presentation.screens.DetailsScreen
import ru.gadzhiev.lightnotes.presentation.screens.main.MainScreen

sealed class Screens(val rout: String) {
    object MainScreen : Screens(rout = "main_screen")
    object DetailsScreen : Screens(rout = "details_screen")
    object AddScreen : Screens(rout = "add_screen")
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.rout
    ){
        composable(route = Screens.MainScreen.rout){
            MainScreen(navController = navController)

        }
        composable(route = Screens.DetailsScreen.rout){
            DetailsScreen()
        }
        composable(route = Screens.AddScreen.rout){
            AddScreen(navController = navController)

        }
    }
}
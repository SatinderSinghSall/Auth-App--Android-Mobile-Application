package com.example.authapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.authapp.screens.HomeScreen
import com.example.authapp.screens.LoginScreen
import com.example.authapp.screens.SignUpScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier, authNewModel: AuthNewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            LoginScreen(modifier, navController, authNewModel)
        }
        composable("signup") {
            SignUpScreen(modifier, navController, authNewModel)
        }
        composable("home") {
            HomeScreen(modifier, navController, authNewModel)
        }
    })
}

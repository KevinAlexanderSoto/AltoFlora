package com.kalex.altoflora.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun RootNavigationGraph(
    rootNavController: NavHostController,
    startDestination: String,
) {
    NavHost(
        navController = rootNavController,
        startDestination = startDestination,
    ) {
        authenticationNav(rootNavController)
    }
}
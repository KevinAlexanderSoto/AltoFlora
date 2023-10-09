package com.kalex.altoflora.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kalex.altoflora.authentication.AuthenticationLoginScreen
import com.kalex.altoflora.authentication.AuthenticationSplashScreen
import com.kalex.altoflora.navigation.Router.AUTHENTICATION_GRAPH
import com.kalex.altoflora.navigation.Router.AUTHENTICATION_LOGIN_SCREEN
import com.kalex.altoflora.navigation.Router.AUTHENTICATION_SPLASH_SCREEN

fun NavGraphBuilder.authenticationNav(rootNavController: NavHostController) {
    navigation(
        route = AUTHENTICATION_GRAPH,
        startDestination = AUTHENTICATION_SPLASH_SCREEN
    ){
        composable(
            route = AUTHENTICATION_SPLASH_SCREEN
        ){
            AuthenticationSplashScreen()
        }
        composable(
            route = AUTHENTICATION_LOGIN_SCREEN
        ){
            AuthenticationLoginScreen()
        }
    }
}
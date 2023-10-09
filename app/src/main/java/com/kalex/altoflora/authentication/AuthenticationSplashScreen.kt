package com.kalex.altoflora.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kalex.altoflora.R

@Composable
fun AuthenticationSplashScreen() {
    val state = rememberLazyListState()
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        LazyColumn(
            state = state,
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {
                val painter = painterResource(R.drawable.splashimg)
                Image(
                    painter,
                    contentDescription = "",
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .aspectRatio(painter.intrinsicSize.width / painter.intrinsicSize.height)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(bottomEnd = 32.dp, bottomStart = 32.dp)),
                    contentScale = ContentScale.Fit,
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "AltoFlora Bank",
                    fontSize = 32.sp
                )
                Text(
                    text = "NANO Wallet official server currency minecraft Picxelmon",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.fillMaxWidth(0.6f)
                )
                Spacer(modifier = Modifier.size(8.dp))

                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth(0.5f),
                ) {
                Text(text = "SignIn")
            }
            }

        }
    }
}
package com.example.instagramprofilecompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

        TopBar(name = "sagar.avhad.9279")
        Spacer(modifier = Modifier.height(4.dp))
    }
}

@Composable
fun TopBar(
    name:String,
    modifier: Modifier = Modifier
) {
Row(
    modifier = modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceAround,
    verticalAlignment = Alignment.CenterVertically
) {

    Icon(
        imageVector = Icons.Default.ArrowBack,
        contentDescription = "Back",
        tint = Color.Black,
        modifier = Modifier.size(24.dp)
    )

    Text(
        text = name,
        overflow = TextOverflow.Ellipsis,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp

    )

    Icon(
        painter = painterResource(id = R.drawable.ic_bell),
        contentDescription = "Notification",
        tint = Color.Black,
        modifier = Modifier.size(24.dp)
    )

    Icon(
        painter = painterResource(id = R.drawable.ic_dotmenu),
        contentDescription = "More Menu",
        tint = Color.Black,
        modifier = Modifier.size(24.dp)
    )
    
}
    
}
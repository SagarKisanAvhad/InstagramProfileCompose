package com.example.instagramprofilecompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            RoundImage(
                image = painterResource(id = R.drawable.ic_launcher_background),
                modifier = Modifier.size(100.dp).weight(3F)
                )
        }
    }
}

@Composable
fun RoundImage(
    image:Painter,
    modifier: Modifier = Modifier
){
    Image(
        painter = image,
        contentDescription = "Profile Pic",
        modifier = modifier
            .aspectRatio(ratio = 1F, matchHeightConstraintsFirst = true)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            )
            .padding(3.dp)
            .clip(CircleShape)
    )
}
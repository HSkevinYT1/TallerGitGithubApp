package me.kevinbayona.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.kevinbayona.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun TerceraPantalla(){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(25.dp))
        Image(
            painter = painterResource(id = R.drawable.kevin),
            contentDescription = "Foto de perfil",
            modifier = Modifier.height(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "Kevin Bayona",
            modifier = Modifier
                .padding(8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text(text = "Desarrollador Móvil Jr",
            modifier = Modifier
                .padding(8.dp),
            fontSize = 14.sp,
            color = Color.Blue,

        )
        Text(text = " ---------------------------------------------------",
            modifier = Modifier
                .padding(8.dp),
            fontSize = 14.sp,
            color = Color.Gray.copy(alpha = 2f)
        )

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.Start) {
            Text(text = "Edad",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Gray.copy(alpha = 0.9f)
            )

            Text(text = "19 años",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(text = "Correo",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Gray.copy(alpha = 0.9f)
            )

            Text(text = "[email protected]",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
            Text(text = "Ciudad",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Gray.copy(alpha = 0.9f)
            )

            Text(text = "Bucaramanga, Colombia",
                modifier = Modifier
                    .padding(8.dp),
                fontSize = 16.sp,
                color = Color.Black
            )
        }


    }

}
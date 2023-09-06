package com.example.calcintent

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calcintent.ui.theme.CalcintentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()

        }
    }
}

@Composable
fun Home() {
    val context= LocalContext.current
    Column(
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)

    ) {


        Text(text = "Calcintent App",
            color=Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 25.sp


            )
        Image(
            painter = painterResource(id = R.drawable.img_1) ,
            contentDescription ="Give me the Moon baby",
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(onClick = {context.startActivity(android.content.Intent(context,calculatorActivity::class.java)) },
            colors=ButtonDefaults.buttonColors(),
            shape=RoundedCornerShape(16.dp)

        )


        {
            Text(text = "Calculator",
                color=Color.Black,


            )





        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(onClick = { context.startActivity(android.content.Intent(context,IntentActivivty::class.java))},
            colors=ButtonDefaults.buttonColors(),
            shape=RoundedCornerShape(20.dp))

        {
            Text(text = "Intent",
                color=Color.Black,


                )


    }

}}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Home()

}



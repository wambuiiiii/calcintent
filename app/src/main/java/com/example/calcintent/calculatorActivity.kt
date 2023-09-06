package com.example.calcintent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calcintent.ui.theme.CalcintentTheme

class calculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calc(){
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }

    var answer by remember { mutableStateOf("")}
    var context= LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Text(text = answer,
        color=Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(

            value = firstnum,
            label = { Text(text = "Enter the first Number:")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange ={
                firstnum=it

            } )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(


            value = secondnum,
            label = { Text(text = "Enter the second Number:")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange ={
                secondnum=it

            } ,
            )
        OutlinedButton(
            onClick = {
              val myfirstnum=firstnum.text.trim()
                val mysecondnum=secondnum.text.trim()
                if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else{
                    val myanswer=myfirstnum.toDouble() + mysecondnum.toDouble()
                    answer=myanswer.toString()
                }},
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.width(250.dp)

        )
        {
            Text(
                text = "+",
                color = Color.Black,


                )

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecondnum=secondnum.text.trim()
                if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else{
                    val myanswer=myfirstnum.toDouble() - mysecondnum.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.width(250.dp)

        )
        {
            Text(
                text = "-",
                color = Color.Black,


                )

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecondnum=secondnum.text.trim()
                if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else{
                    val myanswer=myfirstnum.toDouble() * mysecondnum.toDouble()
                    answer=myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.width(250.dp)

        )
        {
            Text(
                text = "*",
                color = Color.Black,


                )

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecondnum=secondnum.text.trim()
                if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                    answer="Please fill in all details"
                }else{
                    val myanswer=myfirstnum.toDouble() / mysecondnum.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.width(250.dp)

        )
        {
            Text(
                text = "/",
                color = Color.Black,


                )

        }





    }

}

@Preview(showBackground = true)
@Composable
fun CalcPreview2() {
    Calc()

}
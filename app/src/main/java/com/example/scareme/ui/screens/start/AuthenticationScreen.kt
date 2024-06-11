package com.example.scareme.ui.screens.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scareme.ui.theme.ScareMeTheme

@Composable
fun StartScreen(){

    Column (
        modifier= Modifier
            .fillMaxSize()
            .background(Color(0xFF130912))

    ){


//        Image(
//            painter = painterResource(R.drawable.scareme),
//            contentDescription = "null",
//            modifier= Modifier
//                .size(250.dp)
//                .offset(70.dp, 200.dp),
//            // contentScale = ContentScale.FillBounds
//        )

        Spacer(modifier = Modifier.height(300.dp))

        Button(
            onClick = {},
            //colors = ButtonDefaults.buttonColors(Orange),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .fillMaxWidth()
                .offset(0.dp, 130.dp),
        ) {
            Text("Sign Up", fontWeight = FontWeight.Bold, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(24.dp))

   Text(
       text = "Already have an account?"
       ,
       modifier=Modifier.fillMaxWidth()
           .padding(top = 130.dp)
           ,
       textAlign= TextAlign.Center
       ,
       color = Color(0xFFB14623)
   )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Sign In"
            ,
            modifier=Modifier.fillMaxWidth()
               // .padding(top = 140.dp)
            ,
            textAlign= TextAlign.Center
            ,
            color = Color(0xFFF6921D)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ScareMeTheme {
        StartScreen()
    }
}
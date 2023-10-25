import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.examenjetpackcomposeviewmodel.R



@Composable
fun IU() {
    var num by remember { mutableStateOf(0) }
    var textoBoton by remember { mutableStateOf("Start") }

    Column(
        modifier = Modifier
            .size(32.dp)
            .padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Text(
            text = "Ronda",
            fontSize = 25.sp,
        )

        if (num > 10) {
            Text(
                text = "$num",
                color = Color.DarkGray,
                fontSize = 35.sp,
            )
        } else {
            Text(
                text = "$num",
                color = Color.DarkGray,
                fontSize = 25.sp,
            )
            Column (
                modifier = Modifier
                    .size(16.dp)
                    .padding(64.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp)
            )
            {

            }
        }

        // Fila 1: Botones Azul y Verde
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Botón Azul
            Button(
                onClick = { Log.d("Tag", "Estoy en Onclick 1") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Blue),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {

            }

            // Botón Verde
            Button(
                onClick = { Log.d("Tag", "Estoy en Onclick 2") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Green),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {

            }
        }

        // Fila 2: Botones Rojo y Amarillo
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Botón Rojo
            Button(
                onClick = { Log.d("Tag", "Estoy en Onclick 3") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Red),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {

            }

            // Botón Amarillo
            Button(
                onClick = { Log.d("Tag", "Estoy en Onclick 4") },
                modifier = Modifier
                    .size(64.dp)
                    .background(Color.Yellow),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {

            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        )
        {
        Button(
            onClick = { textoBoton = "Reset" },
            modifier = Modifier


                .height(64.dp)
        )
                {
                    androidx.compose.material3.Text(textoBoton)
                }


            Button(
                onClick = { num++ },
                modifier = Modifier
                    .height(64.dp)
                    .background(Color.Cyan),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable._04729),
                    contentDescription = "Sumar una ronda",
                    modifier = Modifier
                        .size(48.dp)

                )
            }



        }

    }
}
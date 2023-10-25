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
import androidx.compose.material3.OutlinedTextField
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
import com.dam.examenjetpackcomposeviewmodel.dataclass
import com.dam.examenjetpackcomposeviewmodel.miViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun IU(miViewModel:miViewModel) {

    Column {

        if ( miViewModel.getNombre().length > 3) {
            Text(
                text = "Nombre: ${ miViewModel.getNombre()}!",
                fontSize = 24.sp,

                )
            Modifier.padding(18.dp)
        }
        OutlinedTextField(
            value = miViewModel.getNombre(),
            onValueChange = {
              miViewModel.misDatos.namee.value = it
            },
            label = { Text(text = "Name") }
        )



    }

    Column {
        Text(
            text = "Numero aleatorio: ${miViewModel.getNumero()}"+"\n Lista de nums: ${miViewModel.getLista()}" ,
            modifier = Modifier.padding(100.dp),
            color = Color.DarkGray
        )
        Button(
            onClick = {
                miViewModel.funcionRandom()
                Log.d("Tag", "Estoy en Onclick")
            },
            modifier = Modifier.padding(64.dp)

        )
        {
            Image(
                painter = painterResource(id = R.drawable._04729),

                contentDescription = "Generar numeros",
                Modifier.padding(8.dp)

            )
        }
    }

}



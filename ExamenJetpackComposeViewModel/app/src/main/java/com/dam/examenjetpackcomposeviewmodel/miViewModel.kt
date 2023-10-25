package com.dam.examenjetpackcomposeviewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class miViewModel : ViewModel(){
    val misDatos = dataclass()

    // Acceder a las propiedades

    fun funcionRandom() {

        misDatos.num.value = (0..3).random()
        misDatos.numList.add(misDatos.num.value)

        Log.d("Tag", "Estoy en el random")
    }


    fun getNumero(): Int {
        return misDatos.num.value
    }
    fun getLista():List<Int>{
        return misDatos.numList
    }
    fun getNombre(): String {
        return misDatos.namee.value
    }
}
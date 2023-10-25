package com.dam.examenjetpackcomposeviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class dataclass(
    var num: MutableState<Int> = mutableStateOf(0),
    var namee: MutableState<String> = mutableStateOf(""),
    val numList: MutableList<Int> = mutableListOf()
)


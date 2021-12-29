package com.probablefish.msb.data

data class Book(
    val title: String,
    var attainedState: AttainedState = AttainedState.ATTAINED
)


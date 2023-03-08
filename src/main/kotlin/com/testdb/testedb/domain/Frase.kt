package com.testdb.testedb.domain

import java.time.LocalDateTime

data class Frase (

    val id: Int,
    val title: String,
    val msg: String,
    val createdAt: LocalDateTime

)
package com.testdb.testedb.application.ports.`in`

import com.testdb.testedb.domain.Frase

interface ListFraseUseCase {

    fun execute() : List<Frase>

}
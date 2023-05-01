package com.testdb.testedb.application.ports.`in`

import com.testdb.testedb.domain.FraseParams

interface UpdateFraseUseCase {
    fun execute(params: FraseParams, id: Int) : Unit

}
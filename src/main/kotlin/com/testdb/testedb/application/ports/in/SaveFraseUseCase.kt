package com.testdb.testedb.application.ports.`in`

import com.testdb.testedb.domain.FraseParams

interface SaveFraseUseCase {

    fun execute(params: FraseParams): Unit

}
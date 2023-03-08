package com.testdb.testedb.application.ports.`in`

import com.testdb.testedb.domain.FraseUpdateParams

interface UpdateFraseUseCase {
    fun execute(params: FraseUpdateParams) : Unit

}
package com.testdb.testedb.application.ports.out

import com.testdb.testedb.domain.Frase
import com.testdb.testedb.domain.FraseParams
import com.testdb.testedb.domain.FraseUpdateParams

interface FraseRespository {
    fun list() : List<Frase>
    fun save(params: FraseParams) : Unit
    fun update(params: FraseUpdateParams) : Unit
    fun del(id: Int) : Unit

}
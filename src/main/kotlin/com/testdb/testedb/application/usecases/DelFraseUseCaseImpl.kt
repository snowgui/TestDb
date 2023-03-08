package com.testdb.testedb.application.usecases

import com.testdb.testedb.application.ports.`in`.DelFraseUseCase
import com.testdb.testedb.application.ports.out.FraseRespository
import org.springframework.stereotype.Service

@Service
class DelFraseUseCaseImpl(

    private val fraseRespository: FraseRespository

): DelFraseUseCase {

    override fun execute(id: Int): Unit {
        fraseRespository.del(id)
    }

}
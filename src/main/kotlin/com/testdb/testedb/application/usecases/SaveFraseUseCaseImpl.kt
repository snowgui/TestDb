package com.testdb.testedb.application.usecases

import com.testdb.testedb.application.ports.`in`.SaveFraseUseCase
import com.testdb.testedb.application.ports.out.FraseRespository
import com.testdb.testedb.domain.FraseParams
import org.springframework.stereotype.Service

@Service
class SaveFraseUseCaseImpl(

    private val fraseRespository : FraseRespository

) : SaveFraseUseCase {
    override fun execute(params: FraseParams): Unit {
        fraseRespository.save(params)
    }

}
package com.testdb.testedb.application.usecases

import com.testdb.testedb.application.ports.`in`.UpdateFraseUseCase
import com.testdb.testedb.application.ports.out.FraseRespository
import com.testdb.testedb.domain.FraseUpdateParams
import org.springframework.stereotype.Service


@Service
class UpdateFraseUseCaseImpl(

    private val fraseRespository : FraseRespository

): UpdateFraseUseCase {

    override fun execute(params: FraseUpdateParams) {
        fraseRespository.update(params)
    }

}
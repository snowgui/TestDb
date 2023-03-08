package com.testdb.testedb.application.usecases

import com.testdb.testedb.application.ports.`in`.ListFraseUseCase
import com.testdb.testedb.application.ports.out.FraseRespository
import com.testdb.testedb.domain.Frase
import org.springframework.stereotype.Service

@Service
class ListFraseUseCaseImpl(

    private val fraseRespository : FraseRespository

): ListFraseUseCase {

    override fun execute(): List<Frase> = fraseRespository.list()

}
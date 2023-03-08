package com.testdb.testedb.adapter.persistence

import com.testdb.testedb.adapter.persistence.mapper.FraseEntityToFraseDomainMapper
import com.testdb.testedb.adapter.persistence.mapper.FraseParamsDomainToFraseEntityMapper
import com.testdb.testedb.adapter.persistence.mapper.FraseUpdateParamsDomainToFraseEntityMapper
import com.testdb.testedb.adapter.persistence.repository.FraseJpaRespository
import com.testdb.testedb.application.ports.out.FraseRespository
import com.testdb.testedb.domain.Frase
import com.testdb.testedb.domain.FraseParams
import com.testdb.testedb.domain.FraseUpdateParams
import org.springframework.stereotype.Repository

@Repository
class FraseRespositoryImpl(

    private val fraseJpaRespository : FraseJpaRespository

): FraseRespository {

    override fun list(): List<Frase> {

        val result = fraseJpaRespository.findAll()
        return result.map { FraseEntityToFraseDomainMapper.toDomain(it) }

    }

    override fun save(params: FraseParams): Unit {

        val ent = FraseParamsDomainToFraseEntityMapper.toEntity(params)
        fraseJpaRespository.save(ent)

    }

    override fun update(params: FraseUpdateParams) {

        val obj = fraseJpaRespository.findById(params.id).get()

        obj.title = params.title
        obj.msg = params.msg

        fraseJpaRespository.save(obj)

    }

    override fun del(id: Int) {

        val obj = fraseJpaRespository.findById(id).get()
        fraseJpaRespository.delete(obj)

    }

}
package com.testdb.testedb.adapter.persistence.mapper

import com.testdb.testedb.adapter.persistence.entity.FraseEntity
import com.testdb.testedb.domain.Frase
object FraseDomainToFraseEntityMapper {

    fun toEntity(ent: Frase) = FraseEntity (
        id = ent.id!!,
        title = ent.title,
        msg = ent.msg,
        createdAt = ent.createdAt
    )

}
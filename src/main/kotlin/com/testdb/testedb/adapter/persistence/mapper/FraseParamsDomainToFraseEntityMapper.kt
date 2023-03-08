package com.testdb.testedb.adapter.persistence.mapper

import com.testdb.testedb.adapter.persistence.entity.FraseEntity
import com.testdb.testedb.domain.FraseParams
import java.time.LocalDateTime

object FraseParamsDomainToFraseEntityMapper {

    fun toEntity(ent: FraseParams) = FraseEntity (
        id = -1,
        title = ent.title,
        msg = ent.msg,
        createdAt = LocalDateTime.now()
    )

}
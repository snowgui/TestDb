package com.testdb.testedb.adapter.persistence.mapper

import com.testdb.testedb.adapter.persistence.entity.FraseEntity
import com.testdb.testedb.domain.FraseUpdateParams
import java.time.LocalDateTime

object FraseUpdateParamsDomainToFraseEntityMapper {

    fun toEntity(ent: FraseUpdateParams) = FraseEntity (
        id = -1,
        title = ent.title,
        msg = ent.msg,
        createdAt = LocalDateTime.now()
    )

}
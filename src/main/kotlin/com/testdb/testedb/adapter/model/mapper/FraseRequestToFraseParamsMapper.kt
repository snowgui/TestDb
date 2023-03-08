package com.testdb.testedb.adapter.model.mapper

import com.testdb.testedb.adapter.model.request.FraseRequest
import com.testdb.testedb.domain.FraseParams
import java.time.LocalDateTime

object FraseRequestToFraseParamsMapper {

    fun toDomain(request: FraseRequest)  = FraseParams(

        title = request.title,
        msg = request.msg,
        createdAt = LocalDateTime.now()

    )

}
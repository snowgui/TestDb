package com.testdb.testedb.adapter.model.mapper

import com.testdb.testedb.adapter.model.request.FraseUpdateRequest
import com.testdb.testedb.domain.FraseUpdateParams

object FraseUpdateRequestToFraseUpdateParamsMapper {

    fun toDomain(request: FraseUpdateRequest)  = FraseUpdateParams(

        id = request.id,
        title = request.title,
        msg = request.msg,

    )

}
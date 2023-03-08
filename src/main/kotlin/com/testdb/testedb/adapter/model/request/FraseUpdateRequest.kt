package com.testdb.testedb.adapter.model.request

import com.fasterxml.jackson.annotation.JsonProperty

data class FraseUpdateRequest(

    @JsonProperty("id")
    val id: Int,

    @JsonProperty("title")
    val title: String,

    @JsonProperty("msg")
    val msg: String,

)

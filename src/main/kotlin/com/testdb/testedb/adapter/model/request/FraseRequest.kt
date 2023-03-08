package com.testdb.testedb.adapter.model.request

import com.fasterxml.jackson.annotation.JsonProperty

data class FraseRequest(

    @JsonProperty("title")
    val title: String,

    @JsonProperty("msg")
    val msg: String,

)

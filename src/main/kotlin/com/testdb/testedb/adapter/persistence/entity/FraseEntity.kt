package com.testdb.testedb.adapter.persistence.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class FraseEntity(

    var title: String,

    var msg: String,

    val createdAt: LocalDateTime,

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = -1

)
{
    private constructor() : this("", "", LocalDateTime.now())

}

package com.testdb.testedb.adapter.persistence.repository

import com.testdb.testedb.adapter.persistence.entity.FraseEntity
import org.springframework.data.repository.CrudRepository

interface FraseJpaRespository : CrudRepository<FraseEntity, Int> {
}
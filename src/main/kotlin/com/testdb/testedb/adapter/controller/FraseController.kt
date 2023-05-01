package com.testdb.testedb.adapter.controller

import com.testdb.testedb.adapter.model.mapper.FraseRequestToFraseParamsMapper
import com.testdb.testedb.adapter.model.request.FraseRequest
import com.testdb.testedb.application.ports.`in`.DelFraseUseCase
import com.testdb.testedb.application.ports.`in`.ListFraseUseCase
import com.testdb.testedb.application.ports.`in`.SaveFraseUseCase
import com.testdb.testedb.application.ports.`in`.UpdateFraseUseCase
import com.testdb.testedb.domain.Frase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("frase")
class FraseController(

    private val listFraseUseCase : ListFraseUseCase,
    private val saveFraseUseCase: SaveFraseUseCase,
    private val updateFraseUseCase: UpdateFraseUseCase,
    private val delFraseUseCase: DelFraseUseCase

) {

    private val MSG_SUCCESS = "success"

    @GetMapping("")
    fun frase(): ResponseEntity<List<Frase>>{

        val result = listFraseUseCase.execute()
        return ResponseEntity.ok().body(result)

    }

    @PostMapping("")
    fun save(@RequestBody request: FraseRequest) : ResponseEntity<String>{

        saveFraseUseCase.execute(FraseRequestToFraseParamsMapper.toDomain(request))
        return ResponseEntity.ok().body(MSG_SUCCESS)

    }

    @PutMapping("{id}")
    fun update(@RequestBody request: FraseRequest, @PathVariable id: Int) : ResponseEntity<String>{

        updateFraseUseCase.execute(FraseRequestToFraseParamsMapper.toDomain(request), id)
        return ResponseEntity.ok().body(MSG_SUCCESS)

    }

    @DeleteMapping("{id}")
    fun del (@PathVariable id: Int) :  ResponseEntity<String>{

        delFraseUseCase.execute(id)
        return ResponseEntity.ok().body(MSG_SUCCESS)

    }

}
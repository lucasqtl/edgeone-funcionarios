package br.com.edgeone.app.controller

import br.com.edgeone.app.model.Funcionario
import br.com.edgeone.app.service.FuncionarioService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/funcionarios")
class FuncionarioController(
    private val funcionarioService: FuncionarioService
) {

    @PostMapping
    fun create(@RequestBody funcionario: Funcionario): ResponseEntity<Funcionario> {
        val createdFuncionario = funcionarioService.create(funcionario)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFuncionario)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Funcionario>> {
        val funcionarios = funcionarioService.findAll()
        return ResponseEntity.ok(funcionarios)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Funcionario> {
        val funcionario = funcionarioService.findById(id)
        return funcionario?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody funcionario: Funcionario): ResponseEntity<Funcionario> {
        val updatedFuncionario = funcionarioService.update(id, funcionario.copy(idFunc = id))
        return updatedFuncionario?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        return if (funcionarioService.delete(id)) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
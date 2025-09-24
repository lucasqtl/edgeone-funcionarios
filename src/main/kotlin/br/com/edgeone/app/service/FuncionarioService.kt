package br.com.edgeone.app.service

import br.com.edgeone.app.model.Funcionario
import br.com.edgeone.app.repository.FuncionarioRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FuncionarioService(
    private val funcionarioRepository: FuncionarioRepository
) {

    fun create(funcionario: Funcionario): Funcionario {
        return funcionarioRepository.save(funcionario)
    }

    fun findAll(): List<Funcionario> {
        return funcionarioRepository.findAll()
    }

    fun findById(id: Long): Funcionario? {
        return funcionarioRepository.findByIdOrNull(id)
    }

    fun update(id: Long, funcionario: Funcionario): Funcionario? {
        // Verifica se o funcionário com o ID fornecido realmente existe
        return if (funcionarioRepository.existsById(id)) {
            // Salva o funcionário. O .save() funciona tanto para criar quanto para atualizar.
            funcionarioRepository.save(funcionario)
        } else {
            null // Retorna nulo se não encontrar o funcionário
        }
    }

    fun delete(id: Long): Boolean {
        return if (funcionarioRepository.existsById(id)) {
            funcionarioRepository.deleteById(id)
            true
        } else {
            false
        }
    }
}

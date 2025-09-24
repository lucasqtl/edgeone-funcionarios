package br.com.edgeone.app.repository

import br.com.edgeone.app.model.Formacao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FormacaoRepository : JpaRepository<Formacao, Long>
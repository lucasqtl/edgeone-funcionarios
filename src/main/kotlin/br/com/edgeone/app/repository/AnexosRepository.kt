package br.com.edgeone.app.repository

import br.com.edgeone.app.model.Anexos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnexosRepository : JpaRepository<Anexos, Long>
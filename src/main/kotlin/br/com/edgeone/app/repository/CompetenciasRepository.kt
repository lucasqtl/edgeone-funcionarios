package br.com.edgeone.app.repository

import br.com.edgeone.app.model.Competencias
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompetenciasRepository : JpaRepository<Competencias, Long>
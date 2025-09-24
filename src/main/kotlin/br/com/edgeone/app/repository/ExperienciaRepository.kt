package br.com.edgeone.app.repository

import br.com.edgeone.app.model.Experiencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExperienciaRepository : JpaRepository<Experiencia, Long>
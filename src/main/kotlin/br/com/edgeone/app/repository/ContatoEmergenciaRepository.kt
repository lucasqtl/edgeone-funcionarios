package br.com.edgeone.app.repository

import br.com.edgeone.app.model.ContatoEmergencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContatoEmergenciaRepository : JpaRepository<ContatoEmergencia, Long>
package br.com.edgeone.app.repository

import br.com.edgeone.app.model.Financeiro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FinanceiroRepository : JpaRepository<Financeiro, Long>
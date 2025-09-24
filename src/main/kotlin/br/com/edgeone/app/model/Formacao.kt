package br.com.edgeone.app.model

import jakarta.persistence.*
import java.time.LocalDate
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "formacao")
data class Formacao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_form")
    val idFormacao: Long = 0,

    @Column(name = "curso")
    val curso: String,

    @Column(name = "curso_nivel")
    val cursoNivel: String,

    @Column(name = "instituicao")
    val instituicao: String,

    @Column(name = "data_inicio")
    val dataInicio: LocalDate,

    @Column(name = "data_conclusao")
    val dataConclusao: LocalDate? = null,

    @ManyToOne
    @JoinColumn(name = "id_func")
    @JsonIgnore
    var funcionario: Funcionario? = null
)
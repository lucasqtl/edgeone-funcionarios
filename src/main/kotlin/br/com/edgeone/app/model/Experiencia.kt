package br.com.edgeone.app.model

import jakarta.persistence.*
import java.time.LocalDate
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "experiencia")
data class Experiencia(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exp")
    val idExperiencia: Long = 0,

    @Column(name = "empresa")
    val empresa: String,

    @Column(name = "cargo")
    val cargo: String,

    @Column(name = "data_inicio")
    val dataInicio: LocalDate,

    @Column(name = "data_fim")
    val dataFim: LocalDate? = null,

    @ManyToOne
    @JoinColumn(name = "id_func")
    @JsonIgnore
    var funcionario: Funcionario? = null
)
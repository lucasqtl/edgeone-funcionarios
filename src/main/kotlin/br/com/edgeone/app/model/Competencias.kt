package br.com.edgeone.app.model

import jakarta.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "competencias")
data class Competencias(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comp")
    val idCompetencia: Long = 0,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "categoria")
    val categoria: String,

    @Column(name = "nivel")
    val nivel: String,

    @ManyToOne
    @JoinColumn(name = "id_func")
    @JsonIgnore
    var funcionario: Funcionario? = null
)
package br.com.edgeone.app.model

import jakarta.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "anexos")
data class Anexos(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_anexo")
    val idAnexo: Long = 0,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "link")
    val link: String,

    @Column(name = "tipo")
    val tipo: String,

    @Column(name = "descricao")
    val descricao: String? = null,
    @ManyToOne
    @JoinColumn(name = "id_func")
    @JsonIgnore
    var funcionario: Funcionario? = null
)
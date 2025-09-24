package br.com.edgeone.app.model

import jakarta.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "financeiro")
data class Financeiro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_finc")
    val idFinanceiro: Long = 0,

    @Column(name = "banco")
    val banco: String,

    @Column(name = "agencia")
    val agencia: String,

    @Column(name = "conta_tipo")
    val contaTipo: String,

    @Column(name = "conta_numero")
    val contaNumero: String,

    @Column(name = "pix_chave")
    val pixChave: String? = null,

    @Column(name = "pix_tipo")
    val pixTipo: String? = null,

    @OneToOne
    @JoinColumn(name = "id_func", insertable = false, updatable = false)
    @JsonIgnore
    var funcionario: Funcionario? = null
)
package br.com.edgeone.app.model

import jakarta.persistence.*
import java.time.LocalDate
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "endereco")
data class Endereco(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    val idEndereco: Long = 0,

    @Column(name = "cep")
    val cep: String,

    @Column(name = "pais")
    val pais: String,

    @Column(name = "estado")
    val estado: String,

    @Column(name = "cidade")
    val cidade: String,

    @Column(name = "bairro")
    val bairro: String,

    @Column(name = "logradouro")
    val logradouro: String,

    @Column(name = "residencia_num")
    val residenciaNum: String,

    @Column(name = "complemento")
    val complemento: String? = null,

    @OneToOne
    @JoinColumn(name = "id_func", insertable = false, updatable = false)
    @JsonIgnore
    var funcionario: Funcionario? = null
)
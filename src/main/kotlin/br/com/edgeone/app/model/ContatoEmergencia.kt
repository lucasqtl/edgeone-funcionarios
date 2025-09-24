package br.com.edgeone.app.model

import jakarta.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "contato_emergencia")
data class ContatoEmergencia(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emerg")
    val idEmergencia: Long = 0,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "telefone")
    val telefone: String,

    @Column(name = "parentesco")
    val parentesco: String,

    @OneToOne
    @JoinColumn(name = "id_func", insertable = false, updatable = false)
    @JsonIgnore
    var funcionario: Funcionario? = null
)
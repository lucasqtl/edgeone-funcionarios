package br.com.edgeone.app.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity
@Table(name = "contato")
data class Contato(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    val idContato: Long = 0,

    @Column(name = "email_inst")
    val emailInstitucional: String,

    @Column(name = "telefone")
    val telefone: String,

    @Column(name = "email_alt")
    val emailAlternativo: String? = null,

    @Column(name = "whatsapp")
    val whatsapp: String? = null,

    @Column(name = "linkedin")
    val linkedin: String? = null,

    @Column(name = "lattes")
    val lattes: String? = null,

    @OneToOne
    @JoinColumn(name = "id_func", insertable = false, updatable = false)
    @JsonIgnore
    var funcionario: Funcionario? = null
)
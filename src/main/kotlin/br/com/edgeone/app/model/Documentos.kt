package br.com.edgeone.app.model

import jakarta.persistence.*
import java.time.LocalDate
import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = "documentos")
data class Documentos(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docs")
    val idDocs: Long = 0,

    @Column(name = "cpf")
    val cpf: String,

    @Column(name = "rg")
    val rg: String,

    @Column(name = "orgao_emissor")
    val orgaoEmissor: String,

    @Column(name = "pis")
    val pis: String,

    @Column(name = "data_cadastro_pis")
    val dataCadastroPis: LocalDate,

    @Column(name = "titulo_eleitor")
    val tituloEleitor: String,

    @Column(name = "zona_eleitoral")
    val zonaEleitoral: String,

    @Column(name = "sessao_eleitoral")
    val sessaoEleitoral: String,

    @OneToOne
    @JoinColumn(name = "id_func", insertable = false, updatable = false)
    @JsonIgnore
    var funcionario: Funcionario? = null
)
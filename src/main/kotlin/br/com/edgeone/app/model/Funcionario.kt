package br.com.edgeone.app.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "funcionario") // Especifica o nome da tabela
data class Funcionario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_func")
    val idFunc: Long = 0,

    @Column(name = "nome")
    val nome: String,

    @Column(name = "data_nascimento")
    val dataNascimento: LocalDate,

    @Column(name = "genero")
    val genero: String,

    @Column(name = "pronomes")
    val pronomes: String,

    @Column(name = "raca")
    val raca: String,

    @Column(name = "estado_civil")
    val estadoCivil: String,

    @Column(name = "dependentes_num")
    val dependentesNum: Int,

    @Column(name = "pessoa_deficiencia")
    val pessoaDeficiencia: String,

    // relações one to one
    @OneToOne(mappedBy = "funcionario", cascade = [CascadeType.MERGE, CascadeType.PERSIST], orphanRemoval = true)
    val documentos: Documentos,

    @OneToOne(mappedBy = "funcionario", cascade = [CascadeType.MERGE, CascadeType.PERSIST], orphanRemoval = true)
    val contato: Contato,

    @OneToOne(mappedBy = "funcionario", cascade = [CascadeType.MERGE, CascadeType.PERSIST], orphanRemoval = true)
    val contatoEmergencia: ContatoEmergencia,

    @OneToOne(mappedBy = "funcionario", cascade = [CascadeType.MERGE, CascadeType.PERSIST], orphanRemoval = true)
    val endereco: Endereco,

    @OneToOne(mappedBy = "funcionario", cascade = [CascadeType.MERGE, CascadeType.PERSIST], orphanRemoval = true)
    val financeiro: Financeiro,

    // relacões one to many
    @OneToMany(mappedBy = "funcionario", cascade = [CascadeType.ALL], orphanRemoval = true)
    val formacoes: List<Formacao> = emptyList(),

    @OneToMany(mappedBy = "funcionario", cascade = [CascadeType.ALL], orphanRemoval = true)
    val experiencias: List<Experiencia> = emptyList(),

    @OneToMany(mappedBy = "funcionario", cascade = [CascadeType.ALL], orphanRemoval = true)
    val competencias: List<Competencias> = emptyList(),

    @OneToMany(mappedBy = "funcionario", cascade = [CascadeType.ALL], orphanRemoval = true)
    val anexos: List<Anexos> = emptyList()
    )
{
    init {
        documentos.funcionario = this
        contato.funcionario = this
        contatoEmergencia.funcionario = this
        endereco.funcionario = this
        financeiro.funcionario = this
        formacoes.forEach { it.funcionario = this }
        experiencias.forEach { it.funcionario = this }
        competencias.forEach { it.funcionario = this }
        anexos.forEach { it.funcionario = this }
    }
}
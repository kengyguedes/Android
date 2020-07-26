package com.kengy.projetomaxima.model


data class Cliente (

    val id : Int,
    val codigo : String,
    val razao_social : String,
    val nomeFantasia : String,
    val cnpj : String,
    val ramo_atividade : String,
    val endereco : String,
    val status : String,
    val contatos : List<Contatos>
)

data class MyCliente(
    var cliente : Cliente
)

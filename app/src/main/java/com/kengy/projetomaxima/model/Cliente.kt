package com.kengy.projetomaxima.model


data class Cliente(

     var id: Int,
     var codigo: String,
     var razao_social: String,
     var nomeFantasia: String,
     var cnpj: String,
     var cpf: String,
     var ramo_atividade: String,
     var endereco: String,
     var status: String,
     var contatos: List<Contato>

)

data class MyCliente(
    var myClienteResponse : Cliente
)

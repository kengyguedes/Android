package com.kengy.projetomaxima.model

class Pedido(

    var numero_ped_Rca: Int,
    var numero_ped_erp: String,
    var codigoCliente: String,
    var NOMECLIENTE: String,
    var data: String,
    var status: String,
    var critica: String,
    var tipo: String,
    var legendas: List<String>
)

data class MyPedido (var pedidos: List<Pedido>)


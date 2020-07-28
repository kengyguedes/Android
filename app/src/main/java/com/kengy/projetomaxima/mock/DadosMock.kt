package com.kengy.projetomaxima.mock

import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato
import com.kengy.projetomaxima.database.entity.EntityPedido

object DadosMock {

    val contato: List<EntityContato> = mutableListOf(

        EntityContato(
            "Gean Delon",
            "3333-3365",
            "62988889888",
            "Maria sem dente",
            "Sócio",
            "Flamengo",
            "gean.paiva@maximasistemas.com.br",
            "1992-12-11",
            "1992-12-11",
           1
        )
    )

    var lstPedido = mutableListOf<EntityPedido>(
        EntityPedido(
            542180,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO",
            mutableListOf(
                "PEDIDO_CANCELADO_ERP",
                "PEDIDO_SOFREU_CORTE",
                "PEDIDO_FEITO_TELEMARKETING"
            )
        ),
        EntityPedido(
            542181,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO", mutableListOf("PEDIDO_FEITO_TELEMARKETING")
        ),
        EntityPedido(
            542182,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO", mutableListOf("PEDIDO_SOFREU_CORTE", "PEDIDO_FEITO_TELEMARKETING")
        ),
        EntityPedido(
            542183,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO", mutableListOf("PEDIDO_SOFREU_CORTE", "PEDIDO_FEITO_TELEMARKETING")
        ),
        EntityPedido(
            542184,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO", mutableListOf("PEDIDO_FEITO_TELEMARKETING")
        ),
        EntityPedido(
            542185,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO", mutableListOf("PEDIDO_CANCELADO_ERP")
        ),
        EntityPedido(
            542186,
            "6421800987",
            "848.246",
            "Burger",
            "2018-09-06T10:12:21-0300",
            "Processado",
            "SUCESSO",
            "ORCAMENTO",
            mutableListOf(
                "PEDIDO_CANCELADO_ERP",
                "PEDIDO_SOFREU_CORTE",
                "PEDIDO_FEITO_TELEMARKETING"
            )
        )
    )

    var cliente =
        EntityCliente(
            30987,
            "40795A",
            "Máxima Sistemas S/A",
            "Máxima Sistemas",
            "10.766.206/002-61",
            "Sistemas",
            "Avenida 136 - Setor Sul - Goiânia/Goiás",
            "Indefinido"

        )

}
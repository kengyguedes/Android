package com.kengy.projetomaxima.database.entity

import androidx.room.Embedded
import androidx.room.Relation
import com.kengy.projetomaxima.View.FragDialogLegendas

class PedidoWithLegends(
    @Embedded val pedido: EntityPedido,
    @Relation(
        parentColumn = "numpedrca",
        entityColumn = "pedidocreatorid"
    )
    val lstLegendas: List<EntityLegendaPedido>
)
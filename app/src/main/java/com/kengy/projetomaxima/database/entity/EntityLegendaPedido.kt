package com.kengy.projetomaxima.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

//@Entity(primaryKeys = ["idlegend", "listLegends", "pedidocreatorid"])
//@Entity(tableName = "legendas", indices = arrayOf(Index(value = ["legenda","pedidocreatorid"], unique = true)))
@Entity(tableName = "legendas")
class EntityLegendaPedido(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "idlegend")
    var idLegend: Int ,
    @ColumnInfo(name = "legenda")
    var legenda: String,
    @ColumnInfo(name = "pedidocreatorid")
    var pedidoCreatorId: Int
)
package com.kengy.projetomaxima.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kengy.projetomaxima.database.entity.EntityPedido

@Entity(tableName = "mxspedidoss")
data class Pedidos(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "numpedrca")
    var numero_ped_Rca: Int,
    @ColumnInfo(name = "numpederp")
    var numero_ped_erp: String,
    @ColumnInfo(name = "codcli")
    var codigoCliente: String,
    @ColumnInfo(name = "nomecliente")
    var NOMECLIENTE: String,
    @ColumnInfo(name = "data")
    var data: String,
    @ColumnInfo(name = "status")
    var status: String,
    @ColumnInfo(name = "critica")
    var critica: String,
    @ColumnInfo(name = "tipo")
    var tipo: String,
  //  @ColumnInfo(name = "legenda")
    var legendas: List<String>
)

data class MyPedido(
    var pedidos: List<EntityPedido>
)


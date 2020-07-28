package com.kengy.projetomaxima.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "mxspedidos")
data class EntityPedido(
    @PrimaryKey(autoGenerate = false)
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
    var tipo: String

){
    @Ignore
    var legendas:List<String>? = null

    constructor(  numero_ped_Rca: Int
                  ,numero_ped_erp: String
                  ,codigoCliente: String
                  ,NOMECLIENTE: String
                  ,data: String
                  ,status: String
                  ,critica: String
                  ,tipo: String,
                  legendas:List<String>
                  ):this (
        numero_ped_Rca = numero_ped_Rca
        , numero_ped_erp = numero_ped_erp
        , codigoCliente = codigoCliente
        , NOMECLIENTE = NOMECLIENTE
        , data = data
        , status = status
        , critica = critica
        , tipo = tipo
    ){
        this.legendas = legendas
    }


}

/*

@Entity(primaryKeys = ["id"])
data class User @Ignore constructor(
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("age")
    val age: Int,

    @Ignore
    val testme: String?
) {
    constructor(id: Int, name: String, age: Int) : this(id, name, age, null)
}*/

package com.kengy.projetomaxima.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mxsclientess")
data class Cliente (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id : Int,
    @ColumnInfo(name = "codcli")
    val codigo : String,
    @ColumnInfo(name = "razaosocial")
    val razao_social : String,
    @ColumnInfo(name = "nomefantasia")
    val nomeFantasia : String,
    @ColumnInfo(name = "cgcent")
    val cnpj : String,
    @ColumnInfo(name = "ramoatividade")
    val ramo_atividade : String,
    @ColumnInfo(name = "endereco")
    val endereco : String,
    @ColumnInfo(name = "status")
    val status : String,

    val contatos : List<Contatos>
)

data class MyCliente(
    var cliente : Cliente
)

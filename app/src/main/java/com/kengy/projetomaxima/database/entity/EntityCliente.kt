package com.kengy.projetomaxima.database.entity

import androidx.room.*
import com.kengy.projetomaxima.model.Contatos


@Entity(tableName = "mxscliente")
data class EntityCliente (

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "idCliente")
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
    val status : String
)
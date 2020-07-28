package com.kengy.projetomaxima.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.kengy.projetomaxima.model.Contatos


@Entity(tableName = "mxscliente")
data class EntityCliente(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "idCliente")
    val id: Int,
    @ColumnInfo(name = "codcli")
    val codigo: String,
    @ColumnInfo(name = "razaosocial")
    val razao_social: String,
    @ColumnInfo(name = "nomefantasia")
    val nomeFantasia: String,
    @ColumnInfo(name = "cgcent")
    val cnpj: String,
    @ColumnInfo(name = "ramoatividade")
    val ramo_atividade: String,
    @ColumnInfo(name = "endereco")
    val endereco: String,
    @ColumnInfo(name = "status")
    val status: String

) {
    @Ignore
    var listContato: List<EntityContato>? = null
    constructor(
        id: Int,
        codigo: String,
        razao_social: String,
        nomeFantasia: String,
        cnpj: String,
        ramo_atividade: String,
        endereco: String,
        status : String,
        listContato: List<EntityContato>
    ) : this(
        id,
        codigo,
        razao_social,
        nomeFantasia,
        cnpj,
        ramo_atividade,
        endereco,
        status
        ){
        this.listContato =listContato
    }
}
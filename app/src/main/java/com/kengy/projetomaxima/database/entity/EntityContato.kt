package com.kengy.projetomaxima.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mxscontato")
data class EntityContato(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "nome")
    val nome: String,
    @ColumnInfo(name = "telefone")
    val telefone: String,
    @ColumnInfo(name = "celular")
    val celular: String,
    @ColumnInfo(name = "conjugue")
    val conjuge: String,
    @ColumnInfo(name = "tipo")
    val tipo: String,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "email")
    val e_mail: String,
    @ColumnInfo(name = "datanascimento")
    val data_nascimento: String,
    @ColumnInfo(name = "datanascimentoconjugue")
    val dataNascimentoConjuge: String,
    @ColumnInfo(name = "userCreatorId")
    val userCreatorId:String
)


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
    val dataNascimentoConjuge: String

) {
    @ColumnInfo(name = "userCreatorId")
    var userCreatorId: Int = 0

    constructor(
        nome: String,
        telefone: String,
        celular: String,
        conjuge: String,
        tipo: String,
        time: String,
        e_mail: String,
        data_nascimento: String,
        dataNascimentoConjuge: String,
        userCreatorId:Int
    ) : this(
     nome,
    telefone,
    celular,
    conjuge,
    tipo,
    time,
    e_mail,
    data_nascimento,
    dataNascimentoConjuge)
    {
        this.userCreatorId = userCreatorId
    }


}


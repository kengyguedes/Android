package com.kengy.projetomaxima.database.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ClienteWithContatos (
    @Embedded val cliente: EntityCliente,
    @Relation(
        parentColumn = "idCliente",
        entityColumn = "userCreatorId"
    )
    val lstContatos: List<EntityContato>

)
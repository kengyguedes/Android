package com.kengy.projetomaxima.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kengy.projetomaxima.database.entity.EntityCliente
import com.kengy.projetomaxima.database.entity.EntityContato

@Dao
interface ClienteDao {

    @Query(value = "select * from mxscliente")
    fun getClientes(): List<EntityCliente>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun gravaPedidosBanco(cliente: EntityCliente,contato: EntityContato)
}
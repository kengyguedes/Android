package com.kengy.projetomaxima.database

import androidx.room.*
import com.kengy.projetomaxima.database.entity.EntityPedido
import com.kengy.projetomaxima.model.Pedidos

@Dao
interface MaxVendaDao {

    @Query(value = "select * from mxspedidos")
    fun getPedidos(): List<EntityPedido>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun gravaPedidosBanco(lstPedidos: MutableList<EntityPedido>)

}

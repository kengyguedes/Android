package com.kengy.projetomaxima.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kengy.projetomaxima.database.entity.*
import com.kengy.projetomaxima.model.Pedidos

@Dao
interface PedidoDao {

    @Query(value = "select * from mxspedidos")
    fun getPedidos(): List<EntityPedido>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun gravaPedidosBanco(lstPedidos: List<EntityPedido>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun gravaPedidosBanco1(pedido: EntityPedido, legendas: List<EntityLegendaPedido>)




    @Query(value = "select * from mxscliente")
    fun getClientes(): List<EntityCliente>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun gravaClientesBanco(cliente: EntityCliente, contatos: List<EntityContato>)


    @Transaction
    @Query("SELECT * FROM mxscliente")
    fun getClienteWithContato(): LiveData<List<ClienteWithContatos>>

    @Transaction
    @Query("SELECT * FROM mxspedidos")
    fun getHistPedFromBD(): LiveData<List<PedidoWithLegends>>



}

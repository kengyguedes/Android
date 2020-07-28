package com.kengy.projetomaxima.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\'J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\'J\u0018\u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004H\'J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/kengy/projetomaxima/database/PedidoDao;", "", "getClienteWithContato", "Landroidx/lifecycle/LiveData;", "", "Lcom/kengy/projetomaxima/database/entity/ClienteWithContatos;", "getClientes", "Lcom/kengy/projetomaxima/database/entity/EntityCliente;", "getHistPedFromBD", "Lcom/kengy/projetomaxima/database/entity/PedidoWithLegends;", "getPedidos", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "gravaClientesBanco", "", "cliente", "contatos", "Lcom/kengy/projetomaxima/database/entity/EntityContato;", "gravaPedidosBanco", "lstPedidos", "gravaPedidosBanco1", "pedido", "legendas", "Lcom/kengy/projetomaxima/database/entity/EntityLegendaPedido;", "app_release"})
public abstract interface PedidoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from mxspedidos")
    public abstract java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido> getPedidos();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void gravaPedidosBanco(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido> lstPedidos);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void gravaPedidosBanco1(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityPedido pedido, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.database.entity.EntityLegendaPedido> legendas);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from mxscliente")
    public abstract java.util.List<com.kengy.projetomaxima.database.entity.EntityCliente> getClientes();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void gravaClientesBanco(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityCliente cliente, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.database.entity.EntityContato> contatos);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM mxscliente")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.ClienteWithContatos>> getClienteWithContato();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM mxspedidos")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.PedidoWithLegends>> getHistPedFromBD();
}
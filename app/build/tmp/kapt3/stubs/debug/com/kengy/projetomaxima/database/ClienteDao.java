package com.kengy.projetomaxima.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/kengy/projetomaxima/database/ClienteDao;", "", "getClientes", "", "Lcom/kengy/projetomaxima/database/entity/EntityCliente;", "gravaPedidosBanco", "", "cliente", "contato", "Lcom/kengy/projetomaxima/database/entity/EntityContato;", "app_debug"})
public abstract interface ClienteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from mxscliente")
    public abstract java.util.List<com.kengy.projetomaxima.database.entity.EntityCliente> getClientes();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void gravaPedidosBanco(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityCliente cliente, @org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityContato contato);
}
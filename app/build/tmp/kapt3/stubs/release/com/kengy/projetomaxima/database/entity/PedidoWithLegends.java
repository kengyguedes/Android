package com.kengy.projetomaxima.database.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kengy/projetomaxima/database/entity/PedidoWithLegends;", "", "pedido", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "lstLegendas", "", "Lcom/kengy/projetomaxima/database/entity/EntityLegendaPedido;", "(Lcom/kengy/projetomaxima/database/entity/EntityPedido;Ljava/util/List;)V", "getLstLegendas", "()Ljava/util/List;", "getPedido", "()Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "app_release"})
public final class PedidoWithLegends {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.kengy.projetomaxima.database.entity.EntityPedido pedido = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "numpedrca", entityColumn = "pedidocreatorid")
    private final java.util.List<com.kengy.projetomaxima.database.entity.EntityLegendaPedido> lstLegendas = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kengy.projetomaxima.database.entity.EntityPedido getPedido() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kengy.projetomaxima.database.entity.EntityLegendaPedido> getLstLegendas() {
        return null;
    }
    
    public PedidoWithLegends(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityPedido pedido, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.database.entity.EntityLegendaPedido> lstLegendas) {
        super();
    }
}
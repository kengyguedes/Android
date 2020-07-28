package com.kengy.projetomaxima.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "legendas")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/kengy/projetomaxima/database/entity/EntityLegendaPedido;", "", "idLegend", "", "legenda", "", "pedidoCreatorId", "(ILjava/lang/String;I)V", "getIdLegend", "()I", "setIdLegend", "(I)V", "getLegenda", "()Ljava/lang/String;", "setLegenda", "(Ljava/lang/String;)V", "getPedidoCreatorId", "setPedidoCreatorId", "app_debug"})
public final class EntityLegendaPedido {
    @androidx.room.ColumnInfo(name = "idlegend")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int idLegend;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "legenda")
    private java.lang.String legenda;
    @androidx.room.ColumnInfo(name = "pedidocreatorid")
    private int pedidoCreatorId;
    
    public final int getIdLegend() {
        return 0;
    }
    
    public final void setIdLegend(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLegenda() {
        return null;
    }
    
    public final void setLegenda(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPedidoCreatorId() {
        return 0;
    }
    
    public final void setPedidoCreatorId(int p0) {
    }
    
    public EntityLegendaPedido(int idLegend, @org.jetbrains.annotations.NotNull()
    java.lang.String legenda, int pedidoCreatorId) {
        super();
    }
}
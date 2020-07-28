package com.kengy.projetomaxima.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "mxspedidos")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0002\u0010\u000eBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003JY\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "", "numero_ped_Rca", "", "numero_ped_erp", "", "codigoCliente", "NOMECLIENTE", "data", "status", "critica", "tipo", "legendas", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNOMECLIENTE", "()Ljava/lang/String;", "setNOMECLIENTE", "(Ljava/lang/String;)V", "getCodigoCliente", "setCodigoCliente", "getCritica", "setCritica", "getData", "setData", "getLegendas", "()Ljava/util/List;", "setLegendas", "(Ljava/util/List;)V", "getNumero_ped_Rca", "()I", "setNumero_ped_Rca", "(I)V", "getNumero_ped_erp", "setNumero_ped_erp", "getStatus", "setStatus", "getTipo", "setTipo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class EntityPedido {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private java.util.List<java.lang.String> legendas;
    @androidx.room.ColumnInfo(name = "numpedrca")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int numero_ped_Rca;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "numpederp")
    private java.lang.String numero_ped_erp;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "codcli")
    private java.lang.String codigoCliente;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nomecliente")
    private java.lang.String NOMECLIENTE;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data")
    private java.lang.String data;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "critica")
    private java.lang.String critica;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "tipo")
    private java.lang.String tipo;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLegendas() {
        return null;
    }
    
    public final void setLegendas(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final int getNumero_ped_Rca() {
        return 0;
    }
    
    public final void setNumero_ped_Rca(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumero_ped_erp() {
        return null;
    }
    
    public final void setNumero_ped_erp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodigoCliente() {
        return null;
    }
    
    public final void setCodigoCliente(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNOMECLIENTE() {
        return null;
    }
    
    public final void setNOMECLIENTE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCritica() {
        return null;
    }
    
    public final void setCritica(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipo() {
        return null;
    }
    
    public final void setTipo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public EntityPedido(int numero_ped_Rca, @org.jetbrains.annotations.NotNull()
    java.lang.String numero_ped_erp, @org.jetbrains.annotations.NotNull()
    java.lang.String codigoCliente, @org.jetbrains.annotations.NotNull()
    java.lang.String NOMECLIENTE, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String critica, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo) {
        super();
    }
    
    public EntityPedido(int numero_ped_Rca, @org.jetbrains.annotations.NotNull()
    java.lang.String numero_ped_erp, @org.jetbrains.annotations.NotNull()
    java.lang.String codigoCliente, @org.jetbrains.annotations.NotNull()
    java.lang.String NOMECLIENTE, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String critica, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> legendas) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kengy.projetomaxima.database.entity.EntityPedido copy(int numero_ped_Rca, @org.jetbrains.annotations.NotNull()
    java.lang.String numero_ped_erp, @org.jetbrains.annotations.NotNull()
    java.lang.String codigoCliente, @org.jetbrains.annotations.NotNull()
    java.lang.String NOMECLIENTE, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String critica, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
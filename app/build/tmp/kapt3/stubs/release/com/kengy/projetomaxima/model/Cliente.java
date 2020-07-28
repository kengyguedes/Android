package com.kengy.projetomaxima.model;

import java.lang.System;

@androidx.room.Entity(tableName = "mxsclientess")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011\u00a8\u0006+"}, d2 = {"Lcom/kengy/projetomaxima/model/Cliente;", "", "id", "", "codigo", "", "razao_social", "nomeFantasia", "cnpj", "ramo_atividade", "endereco", "status", "contatos", "", "Lcom/kengy/projetomaxima/model/Contatos;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCnpj", "()Ljava/lang/String;", "getCodigo", "getContatos", "()Ljava/util/List;", "getEndereco", "getId", "()I", "getNomeFantasia", "getRamo_atividade", "getRazao_social", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class Cliente {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "codcli")
    private final java.lang.String codigo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "razaosocial")
    private final java.lang.String razao_social = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nomefantasia")
    private final java.lang.String nomeFantasia = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cgcent")
    private final java.lang.String cnpj = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ramoatividade")
    private final java.lang.String ramo_atividade = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "endereco")
    private final java.lang.String endereco = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kengy.projetomaxima.model.Contatos> contatos = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodigo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRazao_social() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomeFantasia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCnpj() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRamo_atividade() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndereco() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kengy.projetomaxima.model.Contatos> getContatos() {
        return null;
    }
    
    public Cliente(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String codigo, @org.jetbrains.annotations.NotNull()
    java.lang.String razao_social, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeFantasia, @org.jetbrains.annotations.NotNull()
    java.lang.String cnpj, @org.jetbrains.annotations.NotNull()
    java.lang.String ramo_atividade, @org.jetbrains.annotations.NotNull()
    java.lang.String endereco, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.model.Contatos> contatos) {
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
    public final java.util.List<com.kengy.projetomaxima.model.Contatos> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kengy.projetomaxima.model.Cliente copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String codigo, @org.jetbrains.annotations.NotNull()
    java.lang.String razao_social, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeFantasia, @org.jetbrains.annotations.NotNull()
    java.lang.String cnpj, @org.jetbrains.annotations.NotNull()
    java.lang.String ramo_atividade, @org.jetbrains.annotations.NotNull()
    java.lang.String endereco, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.model.Contatos> contatos) {
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
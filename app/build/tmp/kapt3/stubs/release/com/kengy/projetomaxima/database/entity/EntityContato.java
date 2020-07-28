package com.kengy.projetomaxima.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "mxscontato")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Jc\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\rH\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/kengy/projetomaxima/database/entity/EntityContato;", "", "nome", "", "telefone", "celular", "conjuge", "tipo", "time", "e_mail", "data_nascimento", "dataNascimentoConjuge", "userCreatorId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCelular", "()Ljava/lang/String;", "getConjuge", "getDataNascimentoConjuge", "getData_nascimento", "getE_mail", "getNome", "getTelefone", "getTime", "getTipo", "getUserCreatorId", "()I", "setUserCreatorId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class EntityContato {
    @androidx.room.ColumnInfo(name = "userCreatorId")
    private int userCreatorId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nome")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "telefone")
    private final java.lang.String telefone = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "celular")
    private final java.lang.String celular = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "conjugue")
    private final java.lang.String conjuge = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "tipo")
    private final java.lang.String tipo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "time")
    private final java.lang.String time = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "email")
    private final java.lang.String e_mail = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "datanascimento")
    private final java.lang.String data_nascimento = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "datanascimentoconjugue")
    private final java.lang.String dataNascimentoConjuge = null;
    
    public final int getUserCreatorId() {
        return 0;
    }
    
    public final void setUserCreatorId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTelefone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCelular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConjuge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getE_mail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData_nascimento() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDataNascimentoConjuge() {
        return null;
    }
    
    public EntityContato(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String telefone, @org.jetbrains.annotations.NotNull()
    java.lang.String celular, @org.jetbrains.annotations.NotNull()
    java.lang.String conjuge, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String e_mail, @org.jetbrains.annotations.NotNull()
    java.lang.String data_nascimento, @org.jetbrains.annotations.NotNull()
    java.lang.String dataNascimentoConjuge) {
        super();
    }
    
    public EntityContato(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String telefone, @org.jetbrains.annotations.NotNull()
    java.lang.String celular, @org.jetbrains.annotations.NotNull()
    java.lang.String conjuge, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String e_mail, @org.jetbrains.annotations.NotNull()
    java.lang.String data_nascimento, @org.jetbrains.annotations.NotNull()
    java.lang.String dataNascimentoConjuge, int userCreatorId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kengy.projetomaxima.database.entity.EntityContato copy(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String telefone, @org.jetbrains.annotations.NotNull()
    java.lang.String celular, @org.jetbrains.annotations.NotNull()
    java.lang.String conjuge, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String e_mail, @org.jetbrains.annotations.NotNull()
    java.lang.String data_nascimento, @org.jetbrains.annotations.NotNull()
    java.lang.String dataNascimentoConjuge) {
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
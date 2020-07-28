package com.kengy.projetomaxima.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u0013J\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/kengy/projetomaxima/Repository/RepositoryPedidos;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_dao", "Lcom/kengy/projetomaxima/database/MaxDataBase;", "listHistPedo", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "getListHistPedo", "()Landroidx/lifecycle/MutableLiveData;", "addPedidoBD", "", "pedido", "listLegendas", "", "getHistPedFromBD", "Landroidx/lifecycle/LiveData;", "Lcom/kengy/projetomaxima/database/entity/PedidoWithLegends;", "getHistPedFromServer", "app_release"})
public final class RepositoryPedidos {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido>> listHistPedo = null;
    private com.kengy.projetomaxima.database.MaxDataBase _dao;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido>> getListHistPedo() {
        return null;
    }
    
    public final void getHistPedFromServer() {
    }
    
    public final void addPedidoBD(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityPedido pedido, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> listLegendas) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.PedidoWithLegends>> getHistPedFromBD() {
        return null;
    }
    
    public RepositoryPedidos(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}
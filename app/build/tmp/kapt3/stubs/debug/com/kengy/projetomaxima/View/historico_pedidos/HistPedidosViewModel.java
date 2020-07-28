package com.kengy.projetomaxima.View.historico_pedidos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0006\u0010\r\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kengy/projetomaxima/View/historico_pedidos/HistPedidosViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_repositoryPedidos", "Lcom/kengy/projetomaxima/Repository/RepositoryPedidos;", "addPedidoBD", "", "getHistPedFromBD", "Landroidx/lifecycle/LiveData;", "", "Lcom/kengy/projetomaxima/database/entity/PedidoWithLegends;", "getHistPedFromServer", "getListFromMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "app_debug"})
public final class HistPedidosViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.kengy.projetomaxima.Repository.RepositoryPedidos _repositoryPedidos;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido>> getListFromMutableLiveData() {
        return null;
    }
    
    public final void getHistPedFromServer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.PedidoWithLegends>> getHistPedFromBD() {
        return null;
    }
    
    public final void addPedidoBD() {
    }
    
    public HistPedidosViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
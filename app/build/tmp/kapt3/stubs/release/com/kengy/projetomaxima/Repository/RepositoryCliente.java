package com.kengy.projetomaxima.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/kengy/projetomaxima/Repository/RepositoryCliente;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_dao", "Lcom/kengy/projetomaxima/database/MaxDataBase;", "listCliente", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kengy/projetomaxima/database/entity/EntityCliente;", "getListCliente", "()Landroidx/lifecycle/MutableLiveData;", "addClientesBD", "", "cliente", "getClienteFromServer", "getClientesFromBD", "Landroidx/lifecycle/LiveData;", "", "Lcom/kengy/projetomaxima/database/entity/ClienteWithContatos;", "app_release"})
public final class RepositoryCliente {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kengy.projetomaxima.database.entity.EntityCliente> listCliente = null;
    private com.kengy.projetomaxima.database.MaxDataBase _dao;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kengy.projetomaxima.database.entity.EntityCliente> getListCliente() {
        return null;
    }
    
    public final void getClienteFromServer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.ClienteWithContatos>> getClientesFromBD() {
        return null;
    }
    
    public final void addClientesBD(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.database.entity.EntityCliente cliente) {
    }
    
    public RepositoryCliente(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}
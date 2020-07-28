package com.kengy.projetomaxima.View.dados_cliente;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kengy/projetomaxima/View/dados_cliente/DadosClienteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_repositoryCli", "Lcom/kengy/projetomaxima/Repository/RepositoryCliente;", "getCliente", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kengy/projetomaxima/database/entity/EntityCliente;", "getClienteFromServer", "", "getclientFomBD", "Landroidx/lifecycle/LiveData;", "", "Lcom/kengy/projetomaxima/database/entity/ClienteWithContatos;", "app_release"})
public final class DadosClienteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.kengy.projetomaxima.Repository.RepositoryCliente _repositoryCli = null;
    
    public final void getClienteFromServer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kengy.projetomaxima.database.entity.EntityCliente> getCliente() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kengy.projetomaxima.database.entity.ClienteWithContatos>> getclientFomBD() {
        return null;
    }
    
    public DadosClienteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}
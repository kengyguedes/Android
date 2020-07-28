package com.kengy.projetomaxima.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/kengy/projetomaxima/api/EndPoints;", "", "getAllCli", "Lretrofit2/Call;", "Lcom/kengy/projetomaxima/model/MyCliente;", "getAllPed", "Lcom/kengy/projetomaxima/model/MyPedido;", "app_debug"})
public abstract interface EndPoints {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "pedido")
    public abstract retrofit2.Call<com.kengy.projetomaxima.model.MyPedido> getAllPed();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cliente")
    public abstract retrofit2.Call<com.kengy.projetomaxima.model.MyCliente> getAllCli();
}
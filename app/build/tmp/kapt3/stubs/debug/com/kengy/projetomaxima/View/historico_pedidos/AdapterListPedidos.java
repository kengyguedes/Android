package com.kengy.projetomaxima.View.historico_pedidos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/kengy/projetomaxima/View/historico_pedidos/AdapterListPedidos;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kengy/projetomaxima/View/historico_pedidos/AdapterListPedidos$ViewHolder;", "listPedidos", "", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdapterListPedidos extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kengy.projetomaxima.View.historico_pedidos.AdapterListPedidos.ViewHolder> {
    private final java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido> listPedidos = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kengy.projetomaxima.View.historico_pedidos.AdapterListPedidos.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kengy.projetomaxima.View.historico_pedidos.AdapterListPedidos.ViewHolder holder, int position) {
    }
    
    public AdapterListPedidos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kengy.projetomaxima.database.entity.EntityPedido> listPedidos) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/kengy/projetomaxima/View/historico_pedidos/AdapterListPedidos$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "pedido", "Lcom/kengy/projetomaxima/database/entity/EntityPedido;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.kengy.projetomaxima.database.entity.EntityPedido pedido) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
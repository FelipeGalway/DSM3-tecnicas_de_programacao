/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.felipe.pedido;

/**
 *
 * @author Samsung
 */
public interface PedidoObserver extends Observer {
    
    public void processarPedido(Pedido pedido);
    
}

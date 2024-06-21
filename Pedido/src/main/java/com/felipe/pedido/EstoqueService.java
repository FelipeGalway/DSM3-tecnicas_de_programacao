/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.pedido;

/**
 *
 * @author Samsung
 */
public class EstoqueService implements PedidoObserver {

    @Override
    public void processarPedido(Pedido pedido) {
        this.baixarEstoque(pedido);
    }
    
    public void baixarEstoque(Pedido p) {
        System.out.println("Baixa estoque de pedido: " + p);
    }
    
}

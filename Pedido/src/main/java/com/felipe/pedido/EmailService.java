/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.pedido;

/**
 *
 * @author Samsung
 */
public class EmailService implements PedidoObserver {

    @Override
    public void processarPedido(Pedido pedido) {
        this.sendEmail(pedido);
    }
    
    public void sendEmail(Pedido p) {
        System.out.println("Enviando email....");    
    }
    
}

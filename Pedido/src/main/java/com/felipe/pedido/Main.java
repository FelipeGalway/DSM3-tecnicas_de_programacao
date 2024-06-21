/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.pedido;

/**
 *
 * @author Samsung
 */
public class Main {
    
    public static void main(String...strings) {
        
        EmailService emailService = new EmailService();
        EstoqueService estoqueService = new EstoqueService();
        
        PedidoSubject pedidoSubject = new PedidoSubject();
        
        pedidoSubject.register(emailService);
        pedidoSubject.register(estoqueService);
        
        Pedido pedido = new Pedido(321, "Felipe", 12.99);
        
        pedidoSubject.criarPedido(pedido);
    }
}

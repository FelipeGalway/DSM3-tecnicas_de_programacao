/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciovendas;

/**
 *
 * @author Samsung
 */
public class Teste {
 
    public static void main(String... args) {
        
        Pedido p = Pedido.gerarPedido();
        System.out.println(p.getCliente());
        System.out.println(p.getCodigo());
        System.out.println(p.getTipoVenda());
        
        p.getItens().forEach(item -> {
            System.out.printf("\n%d %d, %s", item.getCodigo(), item.getQuantidade(), item.getP());
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciovendas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class Pedido {
    
    private int codigo;
    private String cliente;
    private String tipoVenda;
    private List<ItemPedido> itens; 
    
    public Double getTotalPedido() {
        
        Double totalPedido = 0D;
        
        for(ItemPedido item : itens) {
            totalPedido += item.getTotalItem();
        }
        
        return totalPedido;
    }
    
    public static Pedido gerarPedido() {
        Pedido novoPedido = new Pedido();
        
        int idAleatorio = (int) (Math.random() * 100);
        
        novoPedido.setCliente("Cliente " + idAleatorio);
        novoPedido.setCodigo(idAleatorio);
        novoPedido.setTipoVenda("A");
        
        List<ItemPedido> listaItens = new ArrayList<ItemPedido>();
        
        int quantidadeItens = (int) (Math.random() * 10);
        
        for (int i = 0; i < quantidadeItens; i++) {
            ItemPedido item = new ItemPedido();
            item.setCodigo(i);
            item.setQuantidade(i + 1);
            item.setP(Produto.gerarDadosProduto());
            
            listaItens.add(item);
        }
        
        novoPedido.setItens(listaItens);
        
        return novoPedido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
}

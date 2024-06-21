/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.pedido;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class PedidoSubject implements Subject {
    
    private List<Observer> observerList = new ArrayList<Observer>();
    
    private Pedido novoPedido;
    
    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        
        for(Observer o : this.observerList) {
        
            if(o instanceof PedidoObserver) {
                PedidoObserver pedidoObserver = (PedidoObserver) o;
                pedidoObserver.processarPedido(novoPedido);
            }
        }
    }
    
    public void criarPedido(Pedido p) {
        this.novoPedido = p;
        this.notifyObservers();
    }
}

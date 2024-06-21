/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.cafeteria;

import java.util.List;

/**
 *
 * @author Samsung
 */
public class Calecon extends BebidaMisturada {

    private List<Bebida> listaBebidas;
    
    public Calecon(List<Bebida> bebidas) {
        this.listaBebidas = bebidas;
        
        super.descricao = "Café com leite e conhaque";
    }
    
    @Override
    public Double getValor() {
        Double total = 0.0;
        
        for(Bebida b : this.listaBebidas) {
            total += b.getValor();
        }
        
        total += 3.0;
        
        return total;
    }
    
}

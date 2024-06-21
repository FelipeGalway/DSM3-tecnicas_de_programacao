/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.cafeteria;

/**
 *
 * @author Samsung
 */
public class ConCafe extends BebidaMisturada {
    
    private Bebida bebida;

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
        super.descricao = "Café com conhaque";
    }
    
    @Override
    public Double getValor() {
        return this.bebida.getValor() + 5.0;
    }
    
}

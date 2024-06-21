/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.cafeteria;

/**
 *
 * @author Samsung
 */
public class Leite extends Bebida {
    
    public Leite() {
        super.descricao = "Leitinho da fazenda";
    }

    @Override
    public Double getValor() {
        return 4.0;
    }
    
}

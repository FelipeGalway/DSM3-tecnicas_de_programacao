/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.cafeteria;

/**
 *
 * @author Samsung
 */
public class Cafe extends Bebida {

    public Cafe() {
        super.descricao = "Cafezinho cremoso";
    } 
            
    @Override
    public Double getValor() {
        return 3.0;
    }
    
}

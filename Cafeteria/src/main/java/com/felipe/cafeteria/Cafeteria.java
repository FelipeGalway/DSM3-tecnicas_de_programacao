/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.felipe.cafeteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class Cafeteria {

    public static void main(String[] args) {
        
        System.out.println("### Cafeteria Francana ###");
        
        Bebida cafe = new Cafe();        
        System.out.println("Bebida: " + cafe.descricao + " - Valor: " + cafe.getValor());
        
        Bebida leite = new Leite();        
        System.out.println("Bebida: " + leite.descricao +  " - Valor: " + leite.getValor());
        
        Bebida concafe = new ConCafe(cafe);
        System.out.println("Bebida: " + concafe.descricao +  " - Valor: " + concafe.getValor());
        
        Bebida conhaque = new Conhaque();
        System.out.println("Bebida: " + conhaque.descricao +  " - Valor: " + conhaque.getValor());
        
        List<Bebida> listaBebidas = new ArrayList<Bebida>();
        listaBebidas.add(cafe);
        listaBebidas.add(leite);
        listaBebidas.add(conhaque);
        
        Bebida calecon = new Calecon(listaBebidas);
        System.out.println("Bebida: " + calecon.descricao +  " - Valor: " + calecon.getValor());
        
        System.out.println("Café: " + (cafe instanceof BebidaMisturada));
        System.out.println("Concafé: " + (concafe instanceof BebidaMisturada));
    }
}

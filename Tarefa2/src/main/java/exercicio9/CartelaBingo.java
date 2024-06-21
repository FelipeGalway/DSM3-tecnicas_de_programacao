/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

import java.util.HashSet;

/**
 *
 * @author Samsung
 */
public class CartelaBingo {
    
    public static void main(String[] args) {
        
        int[][] cartela = new int[5][5];
        
        HashSet<Integer> numerosGerados = new HashSet<>();

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                int numero;
                do {
                    numero = (int) (Math.random() * 100);
                } while (numerosGerados.contains(numero)); 
                cartela[i][j] = numero;
                numerosGerados.add(numero); 
            }
        }
        
        System.out.println("Cartela gerada:");
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }                    
    }
}

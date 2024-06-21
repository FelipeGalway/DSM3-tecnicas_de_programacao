/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author Samsung
 */
public class Matrizes {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonalPrincipal);                          
              
    }
}

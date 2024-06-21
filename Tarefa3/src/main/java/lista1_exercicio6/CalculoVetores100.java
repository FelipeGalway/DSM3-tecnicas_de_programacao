/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio6;

/**
 *
 * @author Samsung
 */
public class CalculoVetores100 {

     public static void main(String... args) {
         
        int[] W = new int[100]; 
        int[] J = new int[100]; 
        int maiorW = Integer.MIN_VALUE; 
        int menorJ = Integer.MAX_VALUE; 
        double somaW = 0;
        double somaJ = 0;
        
        for(int i = 0; i < W.length; i++ ){        
            W[i] = (int) (Math.random() * 100);
            somaW += W[i];
            if (W[i] > maiorW) {
                maiorW = W[i];
            } 
        }
        
          for(int i = 0; i < J.length; i++ ){               
            J[i] = (int) (Math.random() * 100); 
            somaJ += J[i];
            if (J[i] < menorJ) {
                menorJ = J[i];
            }
        }
        
        double mediaW = somaW / W.length;
        double mediaJ = somaJ / J.length;
        
        double t = (maiorW * (menorJ + 1)) / (mediaW + mediaJ);
        System.out.print("Resultado da equação: " + t);
        
    }  
    
}

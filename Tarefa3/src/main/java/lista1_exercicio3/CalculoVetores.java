/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio3;

/**
 *
 * @author Samsung
 */
public class CalculoVetores {
     
    public static void main(String... args) {
         
        int[] w = new int[10]; 
        int[] k = new int[10]; 
        
        for(int i = 0; i < w.length; i++ ){        
            w[i] = (int) (Math.random() * 100);     
        }
        
        for(int i = 0; i < k.length; i++ ){        
            k[i] = (int) (Math.random() * 100);     
        }
        
        for (int i = 0; i < 10; i++) {
            int calculo = (w[i] + k[9 - i]);
            System.out.println("Valor da equação na " + (i + 1) + "ª passada: " + calculo);
        }        
        
    }   
}


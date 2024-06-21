/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Vetor10 {
   
    public static void main(String[] args) {
        
        int[] vetor10 = new int[10];        
           
        for(int i = 0; i < vetor10.length; i++ ){        
            vetor10[i] = (int) (Math.random() * 100);     
        }
        
        System.out.println("Números do Vetor: ");
        for(int i = 0; i < vetor10.length; i++ ){           
            System.out.println(" [" + vetor10[i] + "] ");                       
        }
        
        Scanner input = new Scanner (System.in);
        
        int n; 
        System.out.print("Informe o número de referência: ");
        n = input.nextInt();
                
        System.out.println("Números maiores que o número de referência: ");
        for(int i = 0; i < vetor10.length; i++ ){
            if (vetor10[i] > n) {
                System.out.println(" [" + vetor10[i] + "] ");
            }            
        }
        
        int menor = 0;
        for(int i = 0; i < vetor10.length; i++ ){
            if (vetor10[i] < n) {
                menor++;                
            }            
        }
        System.out.println("Quantidade de números menores que o número de referência: " + menor);
        
        int repetido = 0;
        for(int i = 0; i < vetor10.length; i++ ){
            if (vetor10[i] == n) {
                repetido++;                
            }            
        }
        System.out.println("Quantidade de vezes que o número de referência aparece no vetor: " + repetido);

    }
}

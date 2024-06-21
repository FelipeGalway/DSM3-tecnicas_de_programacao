/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio1;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Vetor {
    
    public static void main(String[] args) {
        
        int[] vetor10 = new int[10];        
        
        Scanner input = new Scanner (System.in);
        
        for(int i = 0; i < vetor10.length; i++ ){        
            System.out.print("Informe o " + (i + 1) + "º número do vetor: ");
            vetor10[i] = input.nextInt();     
        }
        
        System.out.println("Números do Vetor: ");
        for(int i = 0; i < vetor10.length; i++ ){           
            System.out.println(" [" + vetor10[i] + "] ");                       
        }        
       
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
        
        int[] vetor50 = new int[50]; 
        
        for(int i = 0; i < vetor50.length; i++ ){        
            vetor50[i] = (int) (Math.random() * 10);     
        }

        int[] frequencia = new int[10]; 
        
        for (int i = 0; i < vetor10.length; i++) {
            frequencia[vetor10[i]]++;
        }

        int totalDoPrimeiro = 0;
        for (int i = 0; i < 10; i++) {
            totalDoPrimeiro += frequencia[i];
        }
        
        int totalDoSegundo = vetor50.length;
        
        double percentagem = (double) totalDoPrimeiro / totalDoSegundo * 100;
        
        System.out.println("Percentagem de números do vetor de 50 posições que constam no primeiro vetor: " + percentagem + "%");
    
    }
}

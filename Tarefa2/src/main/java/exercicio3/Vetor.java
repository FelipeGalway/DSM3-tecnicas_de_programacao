/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author Samsung
 */
public class Vetor {
    
    public static void main(String[] args) {
        
        int[] vetor100 = new int[100];        
        double soma = 0;
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        int quantidadePares = 0;
        
        for(int i = 0; i < vetor100.length; i++ ){        
            vetor100[i] = (int) (Math.random() * 100);
            
            soma += vetor100[i];
            
            if (vetor100[i] % 2 == 0) { 
                quantidadePares++;
            }
            
            if (vetor100[i] > maior) {
                maior = vetor100[i];
            } 
            
            if (vetor100[i] < menor) {
                menor = vetor100[i];
            }
        }
        
        System.out.println("Números do Vetor: ");
        for(int i = 0; i < vetor100.length; i++ ){
            System.out.println(" [" + vetor100[i] + "] ");
        }
        
        double percentualPares = (double) quantidadePares / vetor100.length * 100;
        
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Percentual de números pares: " + percentualPares + "%");
          
        double media = soma / vetor100.length;
        System.out.println("Média dos elementos: "+ media);
    }
}   


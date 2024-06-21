/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciosrevisao;

/**
 *
 * @author Samsung
 */
public class Exercicio2 {
      /** Crie um método que receba um array de inteiros e preencha-o com valores
     * arbitrários em 20 posições
     * 
     * Crie um método para processar os arrays, que os receba por parâmetro e 
     * calcule a soma de ambos e mostre no seguinte modelo:
     * 
     * A    B   Soma
     *--------------
     * 1    5   6
     * 4    9   13
     */
    
    public static void main(String...strings) {
        
        Integer arrayA[] = new Integer[20];    
        Integer arrayB[] = new Integer[20];  
        
        preencherArray(arrayA);
        preencherArray(arrayB);
        
        somarArrays(arrayA, arrayB);
        
    }   
    
    public static void somarArrays(Integer a[], Integer b[]) {
        
        System.out.println("------------");
        System.out.println("A + B = SOMA");
        System.out.println("------------");
        
        for(int i = 0; i < a.length; i++) {
            Integer soma = a[i] + b[i];
            System.out.printf("\n%d + %d = %d", a[i], b[i], soma);
        }
    }
    
    public static void preencherArray(Integer[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);            
        }
    }
}

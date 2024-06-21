/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciosrevisao;

/**
 *
 * @author Samsung
 */
public class Exercicio1 {
                
    /**
     * Crie um método que receba um parâmetro inteiro e que calcule e retorne o 
     * valor da soma deste número com seus antecessores e sucessores até 1
     * 
     * Mostre o valor no terminal 
     */
         
    public static void main(String...strings) {
        
        int a[] = new int[10];
        
        System.out.println(calcularSoma(10));
        System.out.println(calcularSoma(-10));
    }   

    public static Integer calcularSoma(Integer numero) {
        
        Integer soma = 0;
        
        while(numero != 0) {
            soma += numero;
            
            if(numero > 0) {
                numero--;
            } else {
                numero++;
            }       
        }       
        
        if (soma < 0) {
            soma++;
        }
                
        return soma;
    }
}

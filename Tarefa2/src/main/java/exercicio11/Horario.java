/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Horario {
    
    public static void main(String... args) {
        
       Scanner input = new Scanner(System.in);
       int horas, minutos, segundos;
       
       System.out.print("Informe o primeiro número (representa horas): ");
       horas = input.nextInt();
              
       System.out.print("Informe o segundo número (representa minutos): ");
       minutos = input.nextInt();
          
       System.out.print("Informe o terceiro número (representa segundos): ");
       segundos = input.nextInt();
       
       int seg_horas = horas * 3600;
       System.out.print("" + horas + " horas em segundos são " + seg_horas + " segundos.");
       
       int seg_min = minutos * 60; 
       System.out.print("\n" + minutos + " minutos em segundos são " + seg_min + " segundos.");
       
       System.out.print("\nNão há conversão a fazer no último caso, então são " + segundos + " segundos.");
    
    }
    
}

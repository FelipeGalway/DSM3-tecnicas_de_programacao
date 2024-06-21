/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio5;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Tabuada {
    
    public static void main(String... args) {
        
        Scanner input = new Scanner (System.in);
        
        int n; 
        System.out.print("Informe o número para gerar a tabuada: ");
        n = input.nextInt();
        
        System.out.println("\nTabuada do " + n + ":");
        
        System.out.println("\nSoma:");
        for (int i = 0; i <= 10; i++) {
            int resultado = n + i;
            System.out.println("" + n + " + " + i + " = " + resultado);
        } 
        
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        
        System.out.println("\nMultiplicação:");
        for (int i = 0; i <= 10; i++) {
            int resultado = n * i;
            System.out.println("" + n + " X " + i + " = " + resultado);
        } 
    }    
}

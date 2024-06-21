/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class RaioEsfera {
    
    public static void main (String... args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio; 
        System.out.print("Informe o raio: ");
        raio = input.nextDouble();
        
        double volume = (4 * 3.14 * (raio * raio * raio)) / 3;
        System.out.print("\nO volume da esfera é: " + volume);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Potencia {
    
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       int x, z;
       
       System.out.print("Informe a base: ");
       x = input.nextInt();
              
       System.out.print("Informe o expoente: ");
       z = input.nextInt();
       
       int resultado = 1;
       for (int i = 0; i < z; i++) {
            resultado *= x;
       }
       
       System.out.println("O resultado de " + x + "^" + z + " é: " + resultado);
    }
    
}

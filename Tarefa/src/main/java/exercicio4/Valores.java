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
public class Valores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int n = scanner.nextInt();
        
        int negativos = 0;
        
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(i);           
            }
        }
        
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                System.out.println(i);
                if (i < 0) {
                    negativos++;
                }                
            }
        }
        
        System.out.println("Quantidade de números negativos: " + negativos);
    }
}

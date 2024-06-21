/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Primo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int n = scanner.nextInt();
        
        boolean primo = verificaPrimo(n);
        
        if (primo) {
            System.out.print("O número informado é primo!");
        } else {
            System.out.print("O número informado não é primo!");
        }
    }
    
    public static boolean verificaPrimo (int n) {
        
        if (n < 1) {
            return false;
        }
        
        if (n == 1) {
            return true;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Numeros {
    public static void main(String[] args) {
        int[] conjunto1 = new int[10];
        int[] conjunto2 = new int[10];
        
        Scanner input1 = new Scanner(System.in);
        for(int i = 0; i < conjunto1.length; i++ ){
            System.out.print("Informe o " + (i+1) +"º número do Conjunto 1: ");
            conjunto1[i] = input1.nextInt();
        }
        
        Scanner input2 = new Scanner(System.in);
        for(int i = 0; i < conjunto2.length; i++ ){
            System.out.print("Informe o " + (i+1) +"º número do Conjunto 2: ");
            conjunto2[i] = input2.nextInt();
        }
        
        System.out.print("Números informados do Conjunto 1: ");
        for(int i = 0; i < conjunto1.length; i++ ){
            System.out.print(" [" + conjunto1[i] + "] ");
        }
        
        System.out.print("Números informados do Conjunto 2: ");
        for(int i = 0; i < conjunto2.length; i++ ){
            System.out.print(" [" + conjunto2[i] + "] ");
        }
    }
}

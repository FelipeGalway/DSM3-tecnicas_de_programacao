/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio14;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Triangulo {
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, base;

        System.out.print("Informe a altura e lado do triângulo: ");
        n = input.nextInt();
        base = 2 * n - 1;

        for (int i = 1; i <= base; i++) {
            System.out.println(repetirCaracter('*', i));
        }      
    }   
        

    public static String repetirCaracter(char ch, int base) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < base; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio13;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class LinhasExclamacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Informe a quantidade de linhas: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(repetirCaracter('!', i));
        }      
    }   
        

    public static String repetirCaracter(char ch, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}


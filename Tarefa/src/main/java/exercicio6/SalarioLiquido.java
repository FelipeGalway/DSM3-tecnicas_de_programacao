/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class SalarioLiquido {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário bruto: ");
        double salario = scanner.nextDouble();
        
        double inss = 0;
        double aliquota = 0;
        double desconto = 0;
        double salario_liquido = 0;
        
        if (salario <= 1212) {
            aliquota = 7.5;
            inss = (salario * (aliquota / 100));
            salario_liquido = (salario - inss);
        }
        
        if (salario > 1212 && salario <= 2427.35) {
            aliquota = 9;
            desconto = 18.18;
            inss = (salario * (aliquota / 100)) - desconto;
            salario_liquido = (salario - inss);
        }
        
        if (salario > 2427.35 && salario <= 3641.03) {
            aliquota = 12;
            desconto = 91;
            inss = (salario * (aliquota / 100)) - desconto;
            salario_liquido = (salario - inss);
        }
        
        if (salario > 3641.03 && salario <= 7087.22) {
            aliquota = 14;
            desconto = 163.82;
            inss = (salario * (aliquota / 100)) - desconto;
            salario_liquido = (salario - inss);
        }
        
        else {
            System.out.print("Valor de salário fora da tabela informada.");
        }
        
        System.out.println("##########################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("##########################");
        System.out.println("Salário Bruto.....: " + salario);
        System.out.println("Alíquota INSS(%)..: " + aliquota);
        System.out.println("Desconto INSS.....: " + inss);
        System.out.println("Salário Líquido...: " + salario_liquido);
        System.out.println("##########################");
    }       
    
}

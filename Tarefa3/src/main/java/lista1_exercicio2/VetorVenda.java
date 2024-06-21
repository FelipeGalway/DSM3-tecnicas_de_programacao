/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio2;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class VetorVenda {
    
    public static void main(String... args) {
         
        int[] codigo = new int[10]; 
        double[] valorUnitario = new double[10]; 
        int[] quantidade = new int[10]; 
        double[] totalItem = new double[10];
        int quantidadeTotal = 0;
        double valorTotal = 0;
        double valorUnitarioTotal = 0;
            
        Scanner input = new Scanner (System.in);
    
        for(int i = 0; i < 10; i++ ){        
            System.out.print("Informe o código do " + (i + 1) + "º produto: ");
            codigo[i] = input.nextInt();
            System.out.print("Informe o valor unitário do " + (i + 1) + "º produto: ");
            valorUnitario[i] = input.nextDouble();
            System.out.print("Informe a quantidade do " + (i + 1) + "º produto: ");
            quantidade[i] = input.nextInt();
            quantidadeTotal += quantidade[i];
            totalItem[i] = valorUnitario[i] * quantidade[i]; 
            valorTotal += totalItem[i];
            valorUnitarioTotal += valorUnitario[i];
        }
        
        double mediaItensVenda = quantidadeTotal / 10;
        double valorUnitarioMedio = valorUnitarioTotal / 10;
        
        System.out.print("CÓDIGO  V. UNIT  QTD  TOTAL ITEM");
        for(int i = 0; i < 10; i++ ){        
            System.out.println("\n" + codigo[i] + "        " + valorUnitario[i] + "       " + quantidade[i] + "      " + totalItem[i]); 
        }
        
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotal);
        System.out.println("Valor total vendido: R$ " + valorTotal);
        System.out.println("Quantidade média de itens por venda: " + mediaItensVenda);
        System.out.println("Valor unitário médio: R$ " + valorUnitarioMedio);
        
        int n; 
        System.out.print("Informe um código para consulta de um ítem vendido: ");
        n = input.nextInt();
        for (int i = 0; i < codigo.length; i++) {
            if (codigo[i] == n) {
                System.out.print("CÓDIGO  V. UNIT  QTD  TOTAL ITEM");
                System.out.println("\n" + codigo[i] + "        " + valorUnitario[i] + "       " + quantidade[i] + "      " + totalItem[i]);
            }
        }
    }   
}

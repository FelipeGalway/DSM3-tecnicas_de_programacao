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
public class Venda {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valor_total = 0;
        int quantidade_total = 0;
        
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;      
        
        int maior_codigo = 0;
        double maior_valor = 0;
        int maior_quantidade = 0;
        
        int menor_codigo = 0;
        double menor_valor = 0;
        int menor_quantidade = 0;
        
        for (int i = 1; i <= 10; i++) {            
                       
            Produto p = new Produto();
            
            System.out.printf("Informe o código do produto %d: ", i);
            p.codigo = scanner.nextInt();
            System.out.printf("Informe o valor unitário do produto %d: ", i);
            p.valorUnitario = scanner.nextDouble();
            System.out.printf("Informe a quantidade do produto %d: ", i);
            p.quantidade = scanner.nextInt();
            double valor = (p.valorUnitario * p.quantidade);
            
            if (valor > maior) {
                maior = valor;
                maior_codigo = p.codigo;
                maior_valor = valor;
                maior_quantidade = p.quantidade;
            }
            
             if (valor < menor) {
                menor = valor;
                menor_codigo = p.codigo;
                menor_valor = valor;
                menor_quantidade = p.quantidade;
            }                    
             
            System.out.printf("Valor total do produto %d: %f \n", i, valor);
                                   
            valor_total += valor;
            quantidade_total += p.quantidade;
        }
                
        double valor_medio = (valor_total / quantidade_total);
        System.out.printf("O valor médio por produto vendido foi de R$ %f \n", valor_medio);
        System.out.printf("Maior venda: Código do produto %d, quantidade %d, valor total R$ %f \n", maior_codigo, maior_quantidade, maior_valor);
        System.out.printf("Menor venda: Código do produto %d, quantidade %d, valor total R$ %f \n", menor_codigo, menor_quantidade, menor_valor);
        System.out.printf("O valor total vendido foi de R$ %f \n", valor_total);
        System.out.printf("A quantidade total de produtos vendidos foi de %d \n", quantidade_total);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Principal {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[5];        
        
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe os dados do produto " + (i + 1) + ":");
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Valor de Compra: ");
            double valorCompra = scanner.nextDouble();
            System.out.print("Valor de Venda: ");
            double valorVenda = scanner.nextDouble();
            produtos[i] = new Produto(codigo, quantidade, valorCompra, valorVenda);
        }
                
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar todos os produtos");
        System.out.println("2 - Encontrar produto por código");
        int opcao = scanner.nextInt();
                
        switch (opcao) {
            case 1:
                listarProdutos(produtos);
                break;
            case 2:
                System.out.print("Digite o código do produto: ");
                int codigoProcurado = scanner.nextInt();
                encontrarProdutoPorCodigo(produtos, codigoProcurado);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }    
   
    public static void listarProdutos(Produto[] produtos) {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.codigo);
            System.out.println("Quantidade: " + produto.quantidade);
            System.out.println("Valor de Compra: " + produto.valorCompra);
            System.out.println("Valor de Venda: " + produto.valorVenda);
            System.out.println("----------------------");
        }
    }
        
    public static void encontrarProdutoPorCodigo(Produto[] produtos, int codigo) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                System.out.println("Produto encontrado:");
                System.out.println("Código: " + produto.codigo);
                System.out.println("Quantidade: " + produto.quantidade);
                System.out.println("Valor de Compra: " + produto.valorCompra);
                System.out.println("Valor de Venda: " + produto.valorVenda);
                return;
            }
        }
        System.out.println("Produto não encontrado com o código fornecido.");
    }
}


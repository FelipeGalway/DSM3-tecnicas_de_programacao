/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Samsung
 */

class ProdutoEstadual {
    String descricao;
    double valor;
    double imposto;

    ProdutoEstadual(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = 0.1; 
    }

    void relatorio() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor Final: " + (valor + (valor * imposto)));
    }
}

class ProdutoNacional extends ProdutoEstadual {
    double taxa;

    ProdutoNacional(String descricao, double valor, double taxa) {
        super(descricao, valor);
        this.taxa = taxa;
    }

    @Override
    void relatorio() {
        super.relatorio();
        System.out.println("Taxa: " + taxa);
        System.out.println("Valor Final: " + (valor + (valor * imposto) + taxa));
    }
}

class ProdutoImportado extends ProdutoNacional {
    double taxaImportacao;

    ProdutoImportado(String descricao, double valor, double taxa, double taxaImportacao) {
        super(descricao, valor, taxa);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    void relatorio() {
        super.relatorio();
        System.out.println("Taxa de Importação: " + taxaImportacao);
        System.out.println("Valor Final: " + (valor + (valor * imposto) + taxa + taxaImportacao));
    }
}

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ProdutoEstadual> produtosEstaduais = new ArrayList<>();
        ArrayList<ProdutoNacional> produtosNacionais = new ArrayList<>();
        ArrayList<ProdutoImportado> produtosImportados = new ArrayList<>();

        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos Produtos");
            System.out.println("9 – SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricaoEstadual = scanner.next();
                    System.out.print("Valor: ");
                    double valorEstadual = scanner.nextDouble();
                    produtosEstaduais.add(new ProdutoEstadual(descricaoEstadual, valorEstadual));
                    break;
                case 2:
                    System.out.print("Descrição: ");
                    String descricaoNacional = scanner.next();
                    System.out.print("Valor: ");
                    double valorNacional = scanner.nextDouble();
                    System.out.print("Taxa: ");
                    double taxaNacional = scanner.nextDouble();
                    produtosNacionais.add(new ProdutoNacional(descricaoNacional, valorNacional, taxaNacional));
                    break;
                case 3:
                    System.out.print("Descrição: ");
                    String descricaoImportado = scanner.next();
                    System.out.print("Valor: ");
                    double valorImportado = scanner.nextDouble();
                    System.out.print("Taxa: ");
                    double taxaImportado = scanner.nextDouble();
                    System.out.print("Taxa de Importação: ");
                    double taxaImportacao = scanner.nextDouble();
                    produtosImportados.add(new ProdutoImportado(descricaoImportado, valorImportado, taxaImportado, taxaImportacao));
                    break;
                case 4:
                    for (ProdutoEstadual produto : produtosEstaduais) {
                        produto.relatorio();
                    }
                    break;
                case 5:
                    for (ProdutoNacional produto : produtosNacionais) {
                        produto.relatorio();
                    }
                    break;
                case 6:
                    for (ProdutoImportado produto : produtosImportados) {
                        produto.relatorio();
                    }
                    break;
                case 7:
                    System.out.println("Produtos Estaduais:");
                    for (ProdutoEstadual produto : produtosEstaduais) {
                        produto.relatorio();
                    }
                    System.out.println("Produtos Nacionais:");
                    for (ProdutoNacional produto : produtosNacionais) {
                        produto.relatorio();
                    }
                    System.out.println("Produtos Importados:");
                    for (ProdutoImportado produto : produtosImportados) {
                        produto.relatorio();
                    }
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }
}


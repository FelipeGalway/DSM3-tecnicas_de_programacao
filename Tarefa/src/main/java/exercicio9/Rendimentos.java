/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Samsung
 */
public class Rendimentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o capital inicial: ");
        double capital = scanner.nextDouble();

        System.out.print("Informe o valor da Selic: ");
        double selic = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");

        double totalRendimentoLiquidoBancoPagueMais = 0;
        double totalRendimentoLiquidoFuraBolso = 0;

        System.out.println("Usando o investimento CDB Banco Pague Mais: ");
        double taxaSelicBancoPagueMais = selic * 0.85;

        for (int i = 0; i < 12; i++) {
            int mes = i + 1;
            double rendimentoBruto = capital * (taxaSelicBancoPagueMais / 100);
            double taxaAdministracao = rendimentoBruto * 0.1;
            double rendimentoLiquido = rendimentoBruto - taxaAdministracao;

            capital += rendimentoLiquido;

            System.out.println(mes + "  " + df.format(capital) + "  " + df.format(rendimentoBruto) + "  " + df.format(capital));

            totalRendimentoLiquidoBancoPagueMais += rendimentoLiquido;
        }

        System.out.println("Total de rendimentos: " + df.format(totalRendimentoLiquidoBancoPagueMais));
        System.out.println("Taxa de administração: " + df.format(totalRendimentoLiquidoBancoPagueMais * 0.1));
        System.out.println("Rendimento líquido: " + df.format(totalRendimentoLiquidoBancoPagueMais * 0.9));

        
        System.out.println("\nUsando o investimento CDB Fura Bolso: ");
        double taxaSelicFuraBolso = selic * 0.93;

        for (int i = 0; i < 12; i++) {
            int mes = i + 1;
            double rendimentoBruto = capital * (taxaSelicFuraBolso / 100);
            double imposto = rendimentoBruto * 0.06;
            double taxaAdministracao = capital * 0.01;
            double rendimentoLiquido = rendimentoBruto - imposto - taxaAdministracao;

            capital += rendimentoLiquido;

            System.out.println(mes + "  " + df.format(capital) + "  " + df.format(rendimentoBruto) + "  " + df.format(capital));

            totalRendimentoLiquidoFuraBolso += rendimentoLiquido;
        }

        System.out.println("Total de rendimentos: " + df.format(totalRendimentoLiquidoFuraBolso));
        System.out.println("Imposto: " + df.format(totalRendimentoLiquidoFuraBolso * 0.06));
        System.out.println("Taxa de administração: " + df.format(totalRendimentoLiquidoFuraBolso * 0.01));
        System.out.println("Rendimento líquido: " + df.format(totalRendimentoLiquidoFuraBolso * 0.93));

        
        if (totalRendimentoLiquidoBancoPagueMais > totalRendimentoLiquidoFuraBolso) {
            System.out.println("\nO CDB Banco Pague Mais é o mais vantajoso!");
        } else {
            System.out.println("\nO CDB Fura Bolso é o mais vantajoso!");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */

public class Aluno {
    private int identificador;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private static Scanner scanner = new Scanner(System.in);

    public Aluno() {
    }

    public Aluno(int identificador, String nome, int idade, double peso, double altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("ID do aluno: " + identificador);
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Peso do aluno: " + peso);
        System.out.println("Altura do aluno: " + altura);
    }

    public float calcularIMC() {
        return (float) (peso / (altura * altura));
    }

    public static void main(String[] args) {
        int resposta;
        Aluno aluno = null;

        do {
            System.out.println("MENU");
            System.out.println("1 – Cadastrar Aluno");
            System.out.println("2 – Listar Alunos (somente nome)");
            System.out.println("3 – Relatório Geral (exibe todas as informações)");
            System.out.println("9 – Sair");

            System.out.print("Escolha sua opção: ");
            resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    aluno = CadastroAluno();
                    break;
                case 2:
                    if (aluno != null) {
                        System.out.println(aluno.getNome());
                    } else {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    }
                    break;
                case 3:
                    if (aluno != null) {
                        aluno.exibir();
                        System.out.println("IMC: " + aluno.calcularIMC());
                    } else {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (resposta != 9);
    }

    public static Aluno CadastroAluno() {
        System.out.print("ID do aluno: ");
        int identificador = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.print("Peso do aluno: ");
        double peso = scanner.nextDouble();

        System.out.print("Altura do aluno: ");
        double altura = scanner.nextDouble();

        return new Aluno(identificador, nome, idade, peso, altura);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import java.time.LocalDate;
/**
 *
 * @author Samsung
 */

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private LocalDate dataAdmissao;
    private String cpf;

    public Funcionario(String nome, int matricula, double salario, LocalDate dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    public void receberAumento(double aumento) {
        salario += aumento;
    }

    public double calcularGanhoBrutoAnual() {
        return salario * 12;
    }

    public double calcularGanhoLiquidoMensal() {
        double inss = salario * 0.11; 
        double salarioLiquido = salario - inss;
        if (salario > 2500) {
            double excesso = salario - 2500;
            double ir = excesso * 0.175; 
            salarioLiquido -= ir;
        }
        return salarioLiquido;
    }

    
    public double calcularImposto() {    
        double salario_liquido = calcularGanhoLiquidoMensal();
        double imposto = salario - salario_liquido;
        
        return imposto;
    }
    
    public double calcularGanhoLiquidoAnual() {
        double salarioLiquidoMensal = calcularGanhoLiquidoMensal();
        return salarioLiquidoMensal * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

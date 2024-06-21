/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.sistemabanco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class Conta {
    
    private Integer numero;
    
    private Double saldo = 0D;

    private Double emprestimo;
    
    private List<String> extrato = new ArrayList<String>();
    
    /**
     * construtor sobrecarregado de conta 
     */
    public Conta(Integer numero) {
        this.numero = numero;
    }
    
    public Double alterarSaldo(Double valor) {
        if(this.saldo == null) {
            this.saldo = valor; 
        } else {
            this.saldo += valor;
        }
        
        String operacao = (valor > 0) ? "DEPÓSITO" : "SAQUE";
        extrato.add(new Date() + " " + operacao + " " + valor);
        
        return this.saldo;
    }
    
    public void mostrarExtrato() {
        extrato.forEach(e -> {
            System.out.println(e);
        });
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public Double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public class FrancaBankMovimentacao extends MovimentacaoPadrao implements EmprestimoBusiness {

    @Override
    public void sacar(Conta conta, Double valor) {
        Double limite = (conta.getSaldo() < 0) ? 0.0 : conta.getSaldo() * 0.5;
        
        if((conta.getSaldo() + limite) >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.println("Saldo + limite insuficientes: " + conta.getNumero());
        }
    }

    @Override
    public void emprestar(Conta conta, Double valor) {
        Double valorTotal = valor * 1.15;
        conta.setEmprestimo(valorTotal);
    }

    @Override
    public void amortizar(Conta conta, Double valor) {
        conta.setEmprestimo(conta.getEmprestimo() - valor);
    }
    
}

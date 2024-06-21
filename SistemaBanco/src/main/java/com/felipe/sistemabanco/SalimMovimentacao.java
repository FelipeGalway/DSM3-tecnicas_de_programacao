/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public class SalimMovimentacao extends MovimentacaoPadrao {

    @Override
    public void sacar(Conta conta, Double valor) {
        if(conta.getSaldo() >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.print("Saldo insuficiente na conta " + conta.getNumero());
        }
    }
    
}

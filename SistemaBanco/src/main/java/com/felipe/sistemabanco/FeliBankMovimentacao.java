/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public class FeliBankMovimentacao extends MovimentacaoPadrao {
    
    private static final Double LIMITE = 2000D;
    
    @Override
    public void sacar(Conta conta, Double valor) {
        if((conta.getSaldo() + LIMITE) >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.println("Saldo + limite insuficiente " + conta.getNumero());
        }
    }
    
}

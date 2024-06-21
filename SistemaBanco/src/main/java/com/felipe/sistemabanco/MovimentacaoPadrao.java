/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public abstract class MovimentacaoPadrao implements MovimentacaoBusiness {
    
    @Override
    public void depositar(Conta conta, Double valor) {
        conta.alterarSaldo(valor);
    }
}

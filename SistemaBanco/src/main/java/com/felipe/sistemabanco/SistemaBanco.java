/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public class SistemaBanco {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(123);
        
        MovimentacaoBusiness movimentacao = new SalimMovimentacao();
        
        movimentacao.depositar(c1, 1200D);
        System.out.println(c1.getSaldo());
        
        movimentacao.sacar(c1, 200D);
        System.out.println(c1.getSaldo());
        
        movimentacao.sacar(c1, 1500D);
        
        
        System.out.println("\n################################");
        
        Conta c2 = new Conta(456);
        
        MovimentacaoBusiness feliBank = new FeliBankMovimentacao();
        
        feliBank.depositar(c2, 500D);
        System.out.println(c2.getSaldo());
        
        feliBank.sacar(c2, 100D);
        System.out.println(c2.getSaldo());
        
        feliBank.sacar(c2, 1500D);
        System.out.println(c2.getSaldo());
        
        c2.mostrarExtrato();
    }
}

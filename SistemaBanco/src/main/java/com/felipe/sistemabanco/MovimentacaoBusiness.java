/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public interface MovimentacaoBusiness {
 
    public void sacar(Conta conta, Double valor);
    
    public void depositar(Conta conta, Double valor);
}

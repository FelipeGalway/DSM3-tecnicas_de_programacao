/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.felipe.sistemabanco;

/**
 *
 * @author Samsung
 */
public interface EmprestimoBusiness {
    
    public void emprestar(Conta conta, Double valor);
    
    public void amortizar(Conta conta, Double valor);
}

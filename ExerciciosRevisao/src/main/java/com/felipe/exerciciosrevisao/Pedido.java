/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciosrevisao;

/**
 *
 * @author Samsung
 */
public class Pedido {
    public Integer codigo;
	
    public Integer quantidade;
	
    public Double valorUnitario;
	
	
    public Double calcularTotalDoPedido() {
	return quantidade * valorUnitario;
    }
}

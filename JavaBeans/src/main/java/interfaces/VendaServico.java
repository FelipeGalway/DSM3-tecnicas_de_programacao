/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Samsung
 */
public class VendaServico implements Venda {

    @Override
    public void vender(String cliente, Double total) {
        // código
    }

    @Override
    public Double calcularComissao(Double valorVenda) {
        return valorVenda * 0.1;
    }    
}

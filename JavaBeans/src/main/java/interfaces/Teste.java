/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Samsung
 */
public class Teste {
    public static void main(String... args) {
        
        Venda v = new VendaMercadoria();
        
        v.calcularComissao(100D);
        
        v.vender("Felipe", 15000.00);
        
        String tipoPedido = "mercadoria";
        
        Venda venda;
        
        if("mercadoria".equals(tipoPedido)) {
            venda = new VendaMercadoria();
            venda.vender("João", 1500.00);
            venda.calcularComissao(1500.0);
        } else if ("futura".equals(tipoPedido)) {
            venda = new VendaFutura();
        } else {
            venda = new VendaServico();
            venda.vender("Rafael", 200.99);
            venda.calcularComissao(200.00);            
        }
    }
}

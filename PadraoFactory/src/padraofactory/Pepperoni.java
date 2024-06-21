/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactory;

/**
 *
 * @author Samsung
 */
public class Pepperoni extends Pizza {
    
    public Pepperoni(ServicoEntrega servicoEntrega) {
        super.servicoEntrega = servicoEntrega;
    }

    @Override
    public void tipoPizza() {
        System.out.println("Pepperoni");
    }
    
}

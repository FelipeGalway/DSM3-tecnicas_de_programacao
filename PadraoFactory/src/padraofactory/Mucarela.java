/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactory;

/**
 *
 * @author Samsung
 */
public class Mucarela extends Pizza {
    
    public Mucarela(ServicoEntrega servicoEntrega) {
        super.servicoEntrega = servicoEntrega;
    }
     
    @Override
    public void tipoPizza() {
        System.out.println("Mucarela");
    }
    
}

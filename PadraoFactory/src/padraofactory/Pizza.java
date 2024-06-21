/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactory;

/**
 *
 * @author Samsung
 */
public abstract class Pizza {
    
    protected ServicoEntrega servicoEntrega;
    
    public abstract void tipoPizza();
    
    public ServicoEntrega getServicoEntrega() {
        return this.servicoEntrega;
    }
}

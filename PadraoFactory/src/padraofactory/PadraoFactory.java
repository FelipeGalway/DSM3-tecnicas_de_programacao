/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraofactory;

/**
 *
 * @author Samsung
 */
public class PadraoFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza p1 = PizzaFactory.create(PizzaEnum.Mucarela);
        p1.tipoPizza();
        if(p1.getServicoEntrega() == null) {
            System.out.println("Não tem serviço");
        } else {
            System.out.println(p1.getServicoEntrega().getTipoEntrega());
        }
        
        Pizza p2 = PizzaFactory.create(PizzaEnum.Calabresa);
        p2.tipoPizza();
    }
    
}

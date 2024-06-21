/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraofactory;

/**
 *
 * @author Samsung
 */
public class PizzaFactory {

    public static Pizza create(PizzaEnum pizzaEnum) {
        
        Pizza p = null;
                
        if(pizzaEnum.equals(PizzaEnum.Calabresa)) {
            p = new Calabresa(new ServicoEntrega("Motoboy"));
            
        } else if(pizzaEnum.equals(PizzaEnum.Mucarela)) {
            p = new Mucarela(new ServicoEntrega("Expressa"));
            
        } else if(pizzaEnum.equals(PizzaEnum.Pepperoni)) {
            p = new Pepperoni(null);
        }
        
        return p;        
    }
           
}

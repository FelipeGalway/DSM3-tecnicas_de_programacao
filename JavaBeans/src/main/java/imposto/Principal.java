/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imposto;

/**
 *
 * @author Samsung
 */
public class Principal {
    
    public static void main(String...args) {
        
        Imposto imposto = new Imposto();
        
        System.out.println(imposto.calcularImposto(200.00));
        
        Imposto impostoMG = new ImpostoMG();
        
        System.out.println(impostoMG.calcularImposto(200.00));
        
        Imposto impostoBA = new ImpostoBA();
        
        System.out.println(impostoBA.calcularImposto(200.00));
    }
}

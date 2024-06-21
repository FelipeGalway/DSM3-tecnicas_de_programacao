/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samsung
 */
public class Principal {
    
    public static void main(String... args) {
        
    Pessoa p = new Pessoa();
    p.quemSouEu();
    
    Empregado emp = new Empregado();
    emp.quemSouEu();
    
    Gerente gerente = new Gerente();
    gerente.quemSouEu();
    
    pagarSalario(gerente);
    pagarSalario(emp);
    //pagarSalario(p);
    
    promover(gerente, emp);
    
    }

    public static void pagarSalario(Empregado e) {

    }

    public static void promover(Gerente g, Empregado e) {

    }
}

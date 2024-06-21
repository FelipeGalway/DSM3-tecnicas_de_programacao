/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samsung
 */
public class Gerente extends Empregado {
    
    public void testando() {
        super.nome = "Felipe";
        super.idade = 33;
    }
    
    @Override
    public void quemSouEu() {
        System.out.print("Sou a classe Gerente");
    }
}

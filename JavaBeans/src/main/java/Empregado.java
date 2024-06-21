/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samsung
 */
public class Empregado extends Pessoa {
    
    //private String nome; 
    
    public void teste() {
        super.nome = "Maria";
        this.nome = "Marinha";
    }
    
    public Empregado() {
        System.out.println("Classe Empregado instanciada");
    }
    
    @Override
    public void quemSouEu() {
        System.out.println("Eu sou a classe Empregado");
    }
}

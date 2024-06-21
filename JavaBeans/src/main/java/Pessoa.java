/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samsung
 */
public class Pessoa {
    
    protected String nome;
    
    protected Integer idade;
    
    public Pessoa() {
        System.out.println("Classe Pessoa instanciada");
    }
    
    public void quemSouEu() {
        System.out.println("Eu sou a classe Pessoa");
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getIdade() {
        return this.idade;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

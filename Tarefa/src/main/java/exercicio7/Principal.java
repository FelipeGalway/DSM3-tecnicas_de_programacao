/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author Samsung
 */
public class Principal {
    
    public static void main(String[] args) {    
     
    Aluno a1 = new Aluno();
				
    a1.nome = "Felipe";
    a1.p1 = 10;
    a1.p2 = 5;
    
    System.out.println("Nome do aluno: " + a1.nome);
    System.out.println("Nota da P1: " + a1.p1);
    System.out.println("Nota da P2: " + a1.p2);
    
    System.out.println("#######################");
    System.out.println("Dados após a alteração:");
    System.out.println("#######################");
    
    Aluno a2 = a1;
  
    a2.p1 = 9;
    a2.p2 = 7;
    
    System.out.println("Nome do aluno A1: " + a1.nome);
    System.out.println("Nota da P1: " + a1.p1);
    System.out.println("Nota da P2: " + a1.p2);
    
    System.out.println("Nome do aluno A2: " + a2.nome);
    System.out.println("Nota da P1: " + a2.p1);
    System.out.println("Nota da P2: " + a2.p2);
    
    }
}

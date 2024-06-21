/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

/**
 *
 * @author Samsung
 */
public class ProdutoEscalar {
    
    public static void main(String[] args) {
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
           
        for(int i = 0; i < vetor1.length; i++ ){        
            vetor1[i] = (int) (Math.random() * 100);     
        }
        
        for(int i = 0; i < vetor2.length; i++ ){        
            vetor2[i] = (int) (Math.random() * 100);     
        }
        
        System.out.print("Números do Vetor 1: ");
        for(int i = 0; i < vetor1.length; i++ ){           
            System.out.print(" [" + vetor1[i] + "] ");                       
        }
        
        System.out.print("\nNúmeros do Vetor 2: ");
        for(int i = 0; i < vetor2.length; i++ ){           
            System.out.print(" [" + vetor2[i] + "] ");                       
        }
        
        int produtoEscalar = 0;
        for(int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }       
        System.out.println("\nProduto Escalar: " + produtoEscalar);
    }   
}

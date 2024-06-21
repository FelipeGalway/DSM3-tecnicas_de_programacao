/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio4;

/**
 *
 * @author Samsung
 */
public class Vetores {
    
    public static void main(String... args) {
         
        int[] A = new int[20]; 
        int[] B = new int[20]; 
        int[] C = new int[40];
        
        for(int i = 0; i < A.length; i++ ){        
            A[i] = (int) (Math.random() * 50);               
            B[i] = (int) (Math.random() * 50);     
        }
        
        System.out.print("\nVetor C com elementos únicos (sem repetição) dos vetores A e B: ");
        for(int i = 0; i < A.length; i++) {            
            for(int j = 0; j < B.length; j++) {
                if(A[i] != B[j]) {
                    C[i + 20] = A[i];
                    C[j] = B[j];
                }                
            }       
        }   
        
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();
    }   
}

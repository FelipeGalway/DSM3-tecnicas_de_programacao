/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciologica;

/**
 *
 * @author Samsung
 */
public class ExercicioLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 81;  
        
        int cont = 0; 
        int soma = 0;
        
        for(int i = 1; i <= x; i++) {
            
            if (i % 2 != 0) {
                cont++;
                soma += i;
                
                if (soma == x) {
                    break;
                }
            }                        
        }
        
        System.out.println(cont);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1_exercicio8;

/**
 *
 * @author Samsung
 */
public class ChutesLivres {
    
    public static void main(String... args) {
        
        int[] jogador = new int[10];
        int[] acertos = new int[10];
        double[] discrepancia = new double[10];
        double[] variancia = new double[10];
        int soma_acertos = 0;
                
        for(int i = 0; i < jogador.length; i++ ){        
            jogador[i] = i + 1;                                
            acertos[i] = (int) (Math.random() * 15);
            soma_acertos += acertos[i];
        }
        
        double media_acertos = soma_acertos / 10;
        
        for(int i = 0; i < discrepancia.length; i++) {
            discrepancia[i] = acertos[i] - media_acertos;
            variancia[i] = discrepancia[i] * discrepancia[i]; 
        } 
        
        System.out.print("Jogador   Acertos     Discrepância    Variância");
         for(int i = 0; i < jogador.length; i++ ){        
            System.out.println("\n" + jogador[i] + "           " + acertos[i] + "            " + discrepancia[i] + "            " + variancia[i]); 
        }
    }
}

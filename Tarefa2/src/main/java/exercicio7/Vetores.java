/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author Samsung
 */
public class Vetores {
     
    public static void main(String[] args) {
        
        int[] vetorX = new int[5];
        int[] vetorY = new int[5];
           
        for(int i = 0; i < vetorX.length; i++ ){        
            vetorX[i] = (int) (Math.random() * 100);     
        }
        
        for(int i = 0; i < vetorY.length; i++ ){        
            vetorY[i] = (int) (Math.random() * 100);     
        }
        
        System.out.print("Números do Vetor X: ");
        for(int i = 0; i < vetorX.length; i++ ){           
            System.out.print(" [" + vetorX[i] + "] ");                       
        }
        
        System.out.print("\nNúmeros do Vetor Y: ");
        for(int i = 0; i < vetorY.length; i++ ){           
            System.out.print(" [" + vetorY[i] + "] ");                       
        }
        
       System.out.print("\nSoma entre X e Y: ");
        int[] soma = new int[5];
        for(int i = 0; i < soma.length; i++) {
            soma[i] = vetorX[i] + vetorY[i];
            System.out.print(" [" + soma[i] + "] ");
        }
        
        System.out.print("\nProduto entre X e Y: ");
        int[] produto = new int[5];
        for(int i = 0; i < produto.length; i++) {
            produto[i] = vetorX[i] * vetorY[i];
            System.out.print(" [" + produto[i] + "] ");
        }        

        System.out.print("\nDiferença entre X e Y: ");
        for(int i = 0; i < vetorX.length; i++) {
            boolean encontrado = false;
            for(int j = 0; j < vetorY.length; j++) {
                if(vetorX[i] == vetorY[j]) {
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado) {
                System.out.print(" [" + vetorX[i] + "] ");
            }
        }

        System.out.print("\nIntersecção entre X e Y: ");
        for(int i = 0; i < vetorX.length; i++) {
            for(int j = 0; j < vetorY.length; j++) {
                if(vetorX[i] == vetorY[j]) {
                    System.out.print(" [" + vetorX[i] + "] ");
                    break;
                }
            }
        }

        System.out.print("\nUnião entre X e Y: ");
        for(int i = 0; i < vetorX.length; i++) {
            System.out.print(" [" + vetorX[i] + "] ");
        }
        for(int i = 0; i < vetorY.length; i++) {
            boolean encontrado = false;
            for(int j = 0; j < vetorX.length; j++) {
                if(vetorY[i] == vetorX[j]) {
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado) {
                System.out.print(" [" + vetorY[i] + "] ");
            }
        }
    }
}

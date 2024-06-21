/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.felipe.padraosingleton;

/**
 *
 * @author Samsung
 */
public class Exercicios {

    public static void main(String[] args) {
        
        // Config c = new Config();
        
        Config c = Config.getInstance();
        c.setPropertie("craudio");
        
        System.out.println(c.getPropertie());
        
        Config c2 = Config.getInstance();
        System.out.println("c2: " + c2.getPropertie());
        
        DatabaseConfig db1 = DatabaseConfig.getInstance();
        System.out.println("database: " + db1.getHost());        
    }
}

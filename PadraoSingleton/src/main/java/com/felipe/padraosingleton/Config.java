/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.padraosingleton;

/**
 *
 * @author Samsung
 */
public class Config {
    
    private static Config instance;
     
    private String propertie;
    
    /**
     * Construtor privado, só pode ser usado na mesma classe
     */
    
    private Config() {
    
    }
    
    public static synchronized Config getInstance() {
        
        if (instance == null) {
            instance = new Config();
        }
                
        return instance;
    }
    
    public String getPropertie() {
        return propertie;
    }

    public void setPropertie(String propertie) {
        this.propertie = propertie;
    }
}

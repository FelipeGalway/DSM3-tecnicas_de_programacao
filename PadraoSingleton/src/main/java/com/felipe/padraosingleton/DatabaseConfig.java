/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.padraosingleton;

/**
 *
 * @author Samsung
 */
public class DatabaseConfig {
     
    private String host = "10.0.0.33";
    private Integer port = 8080;
    private String user = "admin";
    private String password = "fatec";
    private Integer poolMin = 2;
    private Integer poolMax = 5;
    private static DatabaseConfig instance;
               
    private DatabaseConfig() {
    
    }
    
    public static synchronized DatabaseConfig getInstance() {
        
        if (instance == null) {
            instance = new DatabaseConfig();
        }
                
        return instance;
    }
    
    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Integer getPoolMin() {
        return poolMin;
    }

    public Integer getPoolMax() {
        return poolMax;
    }
}

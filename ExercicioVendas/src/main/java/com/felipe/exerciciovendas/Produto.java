/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.exerciciovendas;

/**
 *
 * @author Samsung
 */
import java.util.Random;

public class Produto {
    
    private int codigo;
    private String descricao;
    private Double valorUnitario;
    
    public static Produto gerarDadosProduto() {
        Random random = new Random();
        
        Produto novoProduto = new Produto();
        novoProduto.setCodigo(random.nextInt());
        novoProduto.setDescricao("Produto " + random.nextInt());
        novoProduto.setValorUnitario(random.nextDouble());
        
        return novoProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }   

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valorUnitario=" + valorUnitario + '}';
    }    
    
}

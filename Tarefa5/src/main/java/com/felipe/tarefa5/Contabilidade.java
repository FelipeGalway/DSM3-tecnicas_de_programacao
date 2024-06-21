package com.felipe.tarefa5;
    
public class Contabilidade implements PassagemObserver{

    @Override
    public void registrarPassagem(Passagem pedagio) {
        this.regContabil(pedagio);
    }
    
    public void regContabil(Passagem p) {
        System.out.println("Registrando a passagem na contabilidade");        
    }
}
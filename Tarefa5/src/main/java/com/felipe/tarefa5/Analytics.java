package com.felipe.tarefa5;
    
public class Analytics implements PassagemObserver{

    @Override
    public void registrarPassagem(Passagem pedagio) {
        this.regDados(pedagio);
    }
    
    public void regDados(Passagem p) {
        System.out.println("Regitrando os dados da passagem");        
    }
}
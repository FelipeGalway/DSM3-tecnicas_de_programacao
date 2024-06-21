package com.felipe.tarefa5;
    
public class Notificacao implements PassagemObserver{

    @Override
    public void registrarPassagem(Passagem pedagio) {
        this.EnviaWhatsApp(pedagio);
    }
    
    public void EnviaWhatsApp(Passagem p) {
        System.out.println("Enviando mensagem ao cliente");        
    }
        
}

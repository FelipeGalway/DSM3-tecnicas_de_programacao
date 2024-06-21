package com.felipe.tarefa5;
    
public interface Subject {

    public void registrar(Observer observer);

    public void removerRegistro(Observer observer);

    public void notificarObservers();
    
}

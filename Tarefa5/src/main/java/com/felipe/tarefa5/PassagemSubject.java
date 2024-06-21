package com.felipe.tarefa5;
    
import java.util.ArrayList;
import java.util.List;

public class PassagemSubject implements Subject{

    private List<Observer> observersList = new ArrayList<Observer>();
    
    private Passagem novoPedagio;
    
    @Override
    public void registrar(Observer observer) {
        this.observersList.add(observer);
    }

    @Override
    public void removerRegistro(Observer observer) {
        this.observersList.remove(observer);
     }

    @Override
    public void notificarObservers() {
        for(Observer o : this.observersList) {
            if(o instanceof PassagemObserver pedagioObserver) {
                pedagioObserver.registrarPassagem(novoPedagio);
            }
        }
    }
    
    public void registrarPassagem(Passagem p) {
        this.novoPedagio = p;
        this.notificarObservers();
    }
    
}
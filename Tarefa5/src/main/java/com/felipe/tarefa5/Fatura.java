package com.felipe.tarefa5;
        
import java.util.HashMap;
import java.util.Map;

public class Fatura implements PassagemObserver {
    private Map<Integer, Double> totalPorTag = new HashMap<>();

    @Override
    public void registrarPassagem(Passagem pedagio) {
        this.regFatura(pedagio);
    }

    public void regFatura(Passagem p) {
        System.out.println("Registrando passagem na fatura");

        double totalAtual = totalPorTag.getOrDefault(p.getTag(), 0.0);

        totalPorTag.put(p.getTag(), totalAtual + p.getTarifa());
    }

    public double getTotalFinanceiro(int tag) {
        return totalPorTag.getOrDefault(tag, 0.0);
    }

    public Map<Integer, Double> getTotalPorTag() {
        return totalPorTag;
    }
}


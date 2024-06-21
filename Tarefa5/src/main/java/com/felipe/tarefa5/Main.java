/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felipe.tarefa5;

import java.util.Date;

/**
 *
 * @author Samsung
 */
public class Main {
    public static void main(String... strings) {

        Notificacao notificacao = new Notificacao();
        Fatura fatura = new Fatura();
        Analytics analytics = new Analytics();
        Contabilidade contabilidade = new Contabilidade();        

        PassagemSubject passagemSubject = new PassagemSubject();

        passagemSubject.registrar(notificacao);
        passagemSubject.registrar(fatura);
        passagemSubject.registrar(analytics);
        passagemSubject.registrar(contabilidade);

        Passagem p1 = new Passagem(001, new Date(), "EVL7692", "Franca", 12.00);
        registrarPassagem(p1, passagemSubject, "Passagem 1");

        Passagem p2 = new Passagem(002, new Date(), "ESG5555", "Restinga", 10.20);
        registrarPassagem(p2, passagemSubject, "Passagem 2");

        Passagem p3 = new Passagem(003, new Date(), "ZXY9876", "Batatais", 11.20);
        registrarPassagem(p3, passagemSubject, "Passagem 3");

        Passagem p4 = new Passagem(001, new Date(), "EVL7692", "Batatais", 10.80);
        registrarPassagem(p4, passagemSubject, "Passagem 4");
        
        Passagem p5 = new Passagem(001, new Date(), "EVL7692", "São Carlos", 14.00);
        registrarPassagem(p5, passagemSubject, "Passagem 5");
        
        Passagem p6 = new Passagem(003, new Date(), "ZXY9876", "São Paulo", 18.00);        
        registrarPassagem(p6, passagemSubject, "Passagem 6");

        for (Integer tag : fatura.getTotalPorTag().keySet()) {
            System.out.println("Total financeiro da tag " + tag + " na fatura: " + fatura.getTotalFinanceiro(tag));
        }
    }

    private static void registrarPassagem(Passagem passagem, PassagemSubject passagemSubject, String mensagem) {
        System.out.println(mensagem + ":");
        passagemSubject.registrarPassagem(passagem);
        System.out.println(); 
    }
}


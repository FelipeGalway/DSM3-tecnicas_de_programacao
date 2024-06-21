/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private Boolean suspenso;
    
    public Jogador() {
    }
    
    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoes) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;        
    }
    
    public boolean verificarCondicaoDeJogo() {
        if (cartoes == 3) {
            return !suspenso;
        } else {
            return true; 
        }
    }
    
    public void aplicarCartao(int quantidade) {
        cartoes += quantidade;
        if (cartoes >= 3) {
            suspenso = true;
        }
    }
    
    public static void main(String[] args) {  
        Jogador jogador1 = new Jogador(1, "João Paulo", "JP", LocalDate.of(1990, 5, 15), 1, "Goleiro", 80, 0);
        Jogador jogador2 = new Jogador(2, "José Carlos", "Zé Carlos", LocalDate.of(1995, 7, 2), 2, "Defensor", 75, 0);
        Jogador jogador3 = new Jogador(3, "Pedro", "Pedrão", LocalDate.of(1992, 3, 10), 3, "Defensor", 85, 0);
        Jogador jogador4 = new Jogador(4, "José Maria", "Zé Maria", LocalDate.of(1988, 6, 18), 4, "Defensor", 70, 0);
        Jogador jogador5 = new Jogador(5, "Roberto Carlos", "RC", LocalDate.of(1992, 3, 10), 5, "Meio-campo", 80, 0);
        Jogador jogador6 = new Jogador(6, "Carlos", "Carlinhos", LocalDate.of(1995, 6, 16), 6, "Defensor", 95, 0);
        Jogador jogador7 = new Jogador(7, "Manuel", "Pepe", LocalDate.of(2002, 8, 12), 7, "Atacante", 65, 0);
        Jogador jogador8 = new Jogador(8, "Antônio Carlos", "Tonhão", LocalDate.of(1985, 1, 25), 8, "Meio-campo", 82, 0);
        Jogador jogador9 = new Jogador(9, "Gabriel", "Gabigol", LocalDate.of(1994, 4, 15), 9, "Atacante", 88, 0);
        Jogador jogador10 = new Jogador(10, "Edson", "Pelé", LocalDate.of(1990, 11, 8), 10, "Meio-campo", 99, 0);
        Jogador jogador11 = new Jogador(11, "Neymar Júnior", "Neymar", LocalDate.of(1998, 12, 11), 11, "Atacante", 90, 0);

        jogador1.aplicarCartao(2);
        jogador2.aplicarCartao(1);
        jogador3.aplicarCartao(3);
        jogador4.aplicarCartao(4);
        jogador5.aplicarCartao(0);
        jogador6.aplicarCartao(5);
        jogador7.aplicarCartao(3);
        jogador8.aplicarCartao(2);
        jogador9.aplicarCartao(1);
        jogador10.aplicarCartao(0);
        jogador11.aplicarCartao(2);

        ArrayList<Jogador> plantel = new ArrayList<>();
        plantel.add(jogador1);
        plantel.add(jogador2);
        plantel.add(jogador3);
        plantel.add(jogador4);
        plantel.add(jogador5);
        plantel.add(jogador6);
        plantel.add(jogador7);
        plantel.add(jogador8);
        plantel.add(jogador9);
        plantel.add(jogador10);
        plantel.add(jogador11);

        System.out.println("JOGADORES CADASTRADOS");
        for (Jogador jogador : plantel) {           
            System.out.println(jogador.getPosicao() + ": " + jogador.getNumero() + " - " + jogador.getNome() + " - " + jogador.getApelido() + " - " + jogador.getDataNascimento() + " - Condição: " + (jogador.verificarCondicaoDeJogo() ? "Sim" : "Não"));
        }
    }     
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public Boolean getSuspenso() {
        return suspenso;
    }

    public void setSuspenso(Boolean suspenso) {
        this.suspenso = suspenso;
    }
}





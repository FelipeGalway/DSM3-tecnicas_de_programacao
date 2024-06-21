/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Samsung
 */
public class Principal {
    
    public static void main(String... args) {
        
        Pessoa p1 = new Pessoa();
        
        PessoaFisica pf = new PessoaFisica();
        
        PessoaJuridica pj1 = new PessoaJuridica();
        
        Pessoa p = new Pessoa();
        p.setNome("Felipe");
        p.setEmail("felipe.fatec@sp.gov.br");
        
        System.out.println(p);
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Fatec");
        pj.setEmail("fatecfranca@sp.gov.br");
        pj.setCnpj("10.897.543/0001-23");
        
        System.out.println(pj);
                
        cadastrarPessoa(pj);
        cadastrarPessoa(p);
    }
    
    public static void cadastrarPessoa(Pessoa p) {
        
        if(p instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) p;
            System.out.println("PJ: " + pj.getCnpj());
        } else if(p instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) p;
        }    
    }
}

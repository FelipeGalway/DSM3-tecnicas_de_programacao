/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author Samsung
 */
public class Retangulo {
   
    private Double lado1;
    private Double lado2;
    private Double area;
    private Double perimetro;
    
    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;        
    }
    
    public void calcularArea() {
        area = lado1 * lado2;
        System.out.println("O valor da área é: " + area);
    }
    
    public void calcularPerimetro() {
        perimetro = (2 * lado1) + (2 * lado2);
        System.out.println("O valor do perímetro é: " + perimetro);
    }
    
    public static void main(String[] args) {        
        Retangulo novoRetangulo = new Retangulo(10, 5);
        
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
    
        novoRetangulo.setLado2(7.0);
    
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
      
        for (int i = 0; i < 5; i++) {
            Retangulo outroRetangulo = new Retangulo(10, 5);
            System.out.println("Valores do outro retângulo " + (i + 1));
            outroRetangulo.calcularArea();
            outroRetangulo.calcularPerimetro();            
        }
    }
    
    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
}

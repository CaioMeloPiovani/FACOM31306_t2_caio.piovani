package ex02.formaBidmensional;

import ex02.Forma;

public class Quadrado extends Forma{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return lado * lado;
    }

    public void exibirDados() {
        System.out.println("QUADRADO de lado: " + lado + " e area: " + obterArea());
    }

}

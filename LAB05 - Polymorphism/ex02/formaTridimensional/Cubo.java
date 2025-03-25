package ex02.formaTridimensional;

public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return (6 * (lado * lado));
    }

    public double obterVolume(){
        return (lado * lado * lado);
    }

    public void exibirDados(){
        System.out.println("CUBO com area: " + obterArea() + " e Volume: " + obterVolume());
    }
    
}

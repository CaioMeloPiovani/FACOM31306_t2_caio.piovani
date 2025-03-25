package ex02.formaTridimensional;

public class Esfera extends FormaTridimensional{
    private double pi = 3.14;
    private double raio;

    public Esfera(double raio){
       // this.pi = 3.14;
        this.raio = raio;
    }

    public double obterArea(){
        return 4 * pi * raio * raio;
    }
    
    public double obterVolume(){
        return ((4.0/3.0) * pi * raio * raio * raio);
    }

    public void exibirDados(){
        System.out.println("ESFERA de area: " + obterArea() + " e Volume: " + obterVolume());
    }

}
package ex02.formaTridimensional;

public class Tetraedro extends FormaTridimensional {
    private double areaBase;
    private double altura;
    private double lado;

    public Tetraedro(double lado, double areaBase, double altura){
        this.lado = lado;
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public double obterArea(){
        return (lado * lado * Math.sqrt(3));
    }

    public double obterVolume(){
        return ((1.0/3.0) * areaBase * altura);
    }

    public void exibirDados(){
        System.out.println("TETRAEDRO de Area: " + obterArea() + " E Volume: " + obterVolume());
    }

    
}

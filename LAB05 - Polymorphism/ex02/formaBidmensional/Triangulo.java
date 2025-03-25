package ex02.formaBidmensional;

public class Triangulo extends FormaBidmensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double obterArea(){
        return ((base * altura)/2);
    }

    public void exibirDados(){
        System.out.println("TRIANGULO de base: " + base + " Altura: " + altura + " e Area: " + obterArea());
    }
    
}

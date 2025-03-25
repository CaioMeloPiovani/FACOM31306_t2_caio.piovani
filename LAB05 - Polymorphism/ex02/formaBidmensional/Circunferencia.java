package ex02.formaBidmensional;

public class Circunferencia extends FormaBidmensional {
    private double raio;
    private double pi = 3.14;

    public Circunferencia(double raio){
        this.raio = raio;
       // this.pi = 3.14;
    }

    public double obterArea(){
        return pi * raio * raio;
    }

    public void exibirDados() {
        System.out.println("CIRCUNFERENCIA de raio: " + raio + " e area: " + obterArea());
    }
}






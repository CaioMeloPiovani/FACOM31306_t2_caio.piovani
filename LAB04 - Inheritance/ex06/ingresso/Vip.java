package ex06.ingresso;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double calcularValor() {
        return valorIngresso + valorAdicional;
    }

    public void exibirValor() {
        System.out.println("Valor do ingresso VIP: R$" + calcularValor());
        System.out.println();
    }
}
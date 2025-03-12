package ex06.ingresso;

public class Ingresso {
    protected double valorIngresso;

    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void exibirValor() {
        System.out.println("Valor do ingresso: R$" + valorIngresso);
    }
}
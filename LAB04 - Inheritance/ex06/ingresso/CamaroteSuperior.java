package ex06.ingresso;

public class CamaroteSuperior extends Vip {
    private double valorAdicionalSuperior;

    public CamaroteSuperior(double valorIngresso, double valorAdicional, double valorAdicionalSuperior) {
        super(valorIngresso, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }


    public double calcularValor() {
        return super.calcularValor() + valorAdicionalSuperior;
    }

    public void exibirValor() {
        System.out.println("Valor do ingresso Camarote Superior: R$" + calcularValor());
    }
}
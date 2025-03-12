package ex06.ingresso;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void exibirValor() {
        System.out.println("Valor do ingresso Camorote Inferior: R$" + calcularValor());
    }

    public void imprimeLocalizacao() {
        System.out.println("Localizacao dos Camarotes: " + localizacao);
    }
}
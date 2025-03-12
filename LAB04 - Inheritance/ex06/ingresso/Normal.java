package ex06.ingresso;

public class Normal extends Ingresso {
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    
    public void exibirValor() {
        System.out.println("Ingresso Normal: " + valorIngresso);
        System.out.println();
    }
}
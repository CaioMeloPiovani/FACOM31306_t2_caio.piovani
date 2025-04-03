package ex2;

public class Main {
    public static void main(String[] args) {
        Operacao[] operacaos = new Operacao[2];


        operacaos[0] = new Operacao(10, 2);
        operacaos[1] = new Operacao(5, 0);

        operacaos[0].iniciarOperacao();
        operacaos[1].iniciarOperacao();
    }
}

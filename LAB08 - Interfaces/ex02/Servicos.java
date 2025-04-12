public class Servicos implements Classificavel {
    private double preco;

    public Servicos(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int eMenorQue(Classificavel precoComparado) {
        Servicos compara = (Servicos) precoComparado;
        if (this.preco < compara.preco) {
            return 1; // sou menor
        } else {
            return 0; // não sou menor
        }
    }
}

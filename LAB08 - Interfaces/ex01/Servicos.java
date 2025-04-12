public class Servicos implements Classificavel{
    private double preco ;

    public Servicos(int preco){
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel precoComparado){
        Servicos compara = (Servicos) precoComparado;
        if(this.preco < compara.preco){
            return true;
        } else {
            return false;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
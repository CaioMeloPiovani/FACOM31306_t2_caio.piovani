public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }
    
    @Override
    public boolean eMenorQue(Classificavel produtoComparado){
        Produto compara = (Produto) produtoComparado;
        if(this.codigo < compara.codigo){
            return true;
        } else {
            return false;
        }
    }

}
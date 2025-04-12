public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int eMenorQue(Classificavel codigoComparado) {
        Produto compara = (Produto) codigoComparado;
        if (this.codigo < compara.codigo) {
            return 1;
        } else {
            return 0;
        }
    }
}

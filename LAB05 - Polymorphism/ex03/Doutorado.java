package ex03;

public class Doutorado extends Mestrado {
    private String tituloTese;
    public Doutorado(String nome, String endereco, String tituloTese, String linhaPesquisa){
        super(nome, endereco, linhaPesquisa);
        this.tituloTese = tituloTese;
    }

    public String getTituloTese(){
        return tituloTese;
    }

    @Override
    public void printa(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco() + 
            "; Título tese: " + tituloTese);
        } else {
            super.exibir();
            System.out.println("Título tese: " + tituloTese);
        }
    }
}
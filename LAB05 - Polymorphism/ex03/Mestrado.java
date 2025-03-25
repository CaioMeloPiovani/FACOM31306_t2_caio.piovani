package ex03;

public class Mestrado extends Estudante{
    private String linhaPesquisa ;

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public Mestrado(String nome, String endereco, String linhasPesquisa){
        super(nome, endereco);
        this.linhaPesquisa = linhasPesquisa;
    }

    @Override
    public void printa(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco() + 
            "; Linha de pesquisa: " + linhaPesquisa);
        } else {
            super.exibir();
            System.out.println("Linha de pesquisa: " + linhaPesquisa);
        }
    }
}
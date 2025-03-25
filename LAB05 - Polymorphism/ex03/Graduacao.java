package ex03;

public class Graduacao extends Estudante {

    public Graduacao(String nome, String endereco){
        super(nome,endereco);

    }

    @Override
    public void printa(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco());
        } else {
            super.exibir();
        }
    }
}
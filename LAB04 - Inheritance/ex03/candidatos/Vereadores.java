package ex03.candidatos;

public class Vereadores extends Candidatos {
    private String numeroPartido;
    private String bairro;

    // Novo construtor que copia os dados do candidato e adiciona os atributos específicos do vereador
    public Vereadores(String nome, String dataNascimento, String genero, String partido, String numeroPartido, String bairro, double patrimonio, boolean reeleicao) {
        super(nome, dataNascimento, genero, partido, patrimonio, reeleicao);
        this.numeroPartido = numeroPartido;
        this.bairro = bairro;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("NUMERO PARTIDO: " + numeroPartido);
        System.out.println("ENDERECO: " + bairro);
    }

    @Override
    public String toString(){
        return super.toString() + ", Numero Partido: " + numeroPartido + ", Bairro: " + bairro;
    }
}

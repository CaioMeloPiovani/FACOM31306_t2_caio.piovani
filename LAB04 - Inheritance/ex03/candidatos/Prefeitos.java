package ex03.candidatos;

public class Prefeitos extends Candidatos {
    private int numeroPartido;
    private String vice;

    public Prefeitos(String nome, String dataNascimento, String genero, String partido, int numeroPartido, String vice, double patrimonio, boolean reeleicao){
        super(nome, dataNascimento, genero, partido, patrimonio, reeleicao);
        this.numeroPartido = numeroPartido;
        this.vice = vice;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("NUMERO PARTIDO: " + numeroPartido);
        System.out.println("VICE: " + vice);
    }

    @Override
    public String toString(){
        return super.toString() + ", Numero Partido: " + numeroPartido + ", Vice: " + vice;
    }
}

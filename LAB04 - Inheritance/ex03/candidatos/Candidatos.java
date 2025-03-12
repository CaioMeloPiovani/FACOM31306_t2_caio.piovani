package ex03.candidatos;

public class Candidatos {
    private String nome;
    private String dataNascimento;
    private String genero;
    private String partido;
    private double patrimonio;
    private boolean reeleicao;

    public Candidatos(String nome, String dataNascimento, String genero, String partido, double patrimonio, boolean reeleicao){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.partido = partido;
        this.patrimonio = patrimonio;
        this.reeleicao = reeleicao;
    }

    public void exibirDados(){
        System.out.println("NOME: " + nome);
        System.out.println("DATA NASCIMENTO: " + dataNascimento);
        System.out.println("GENERO: " + genero);
        System.out.println("PARTIDO: " + partido);
        System.out.println("PATRIMONIO: " + patrimonio);
        if(reeleicao) {
            System.out.println("Candidato pode ser reeleito");
        } else {
            System.out.println("Candidato NAO pode ser reeleito");
        }
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Data Nascimento: " + dataNascimento + ", Genero: " + genero + ", Partido: " + partido + ", Patrimonio: " + patrimonio + ", Reeleicao: " + (reeleicao ? "Sim" : "Nao");
    }
}

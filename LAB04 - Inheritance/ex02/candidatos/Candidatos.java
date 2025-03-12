package ex02.candidatos;
public class Candidatos {
    protected String nome;
    protected String dataNascimento;
    protected String genero;
    protected String partido;
    protected double patrimonio;
    protected boolean reeleicao;

    public Candidatos(String nome, String dataNascimento, String genero, String partido, double patrimonio,  boolean reeleicao){
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    @Override
    public String toString(){
        return "Nome" + nome + "Data nascimento" + dataNascimento + "Genero" + genero + "Partido" + partido + "Patrimonio" + patrimonio + "Reeleicao:" + (reeleicao ? "Sim" : "Não");
    }

}
package ex02.candidatos;

public class Vereadores extends Candidatos{
    private String numeroPartido;
    private String bairro;

    public Vereadores(String nome, String dataNascimento, String genero, String partido, String numeroPartido, String bairro, double patrimonio, boolean reeleicao) {
        super(nome, dataNascimento, genero, partido, patrimonio, reeleicao);
        this.numeroPartido = numeroPartido;
        this.bairro = bairro;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("NUMERO PARTIDO: " + numeroPartido);
        System.out.println("ENDERECO: " + bairro);


    }


    public String getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(String numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro; 
    }

    @Override
    public String toString(){
        return "Numero partido: " + numeroPartido + "Bairro: " + bairro;
    }

}

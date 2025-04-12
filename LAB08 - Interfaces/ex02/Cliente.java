public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public int eMenorQue(Classificavel nomeComparado){
        Cliente compara = (Cliente) nomeComparado;
        if (this.nome.compareTo(compara.nome) < 0) {
            return 1; // sou menor
        } else {
            return 0; // não sou menor
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

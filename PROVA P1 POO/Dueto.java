public class Dueto {
    private String nome;
    private Musico titular1;
    private Musico titular2;
    private Musico substituto;

    // contruturo dos 2 musicos + sub
    public Dueto(String nome, Musico titular1, Musico titular2, Musico substituto) {
        this.nome = nome;
        this.titular1 = titular1;
        this.titular2 = titular2;
        this.substituto = substituto;
    }

    // construtor 2 music SEM SUB
    public Dueto(String nome, Musico titular1, Musico titular2) {
        this.nome = nome;
        this.titular1 = titular1;
        this.titular2 = titular2;
        this.substituto = null;
    }

    double CalculoRemuneracao(){
        double soma = titular1.getRemuneracao() + titular2.getRemuneracao();
        int quantidade = 2;

        if(substituto != null){
            soma += substituto.getRemuneracao();
            quantidade = 3;
        }

        return soma / quantidade;

    }



    @Override
    public String toString() {
        if (substituto != null) {
            return "\nDueto: " + nome + "\nMUSICO 1:" + titular1 + "\nMUSICO 2:" + titular2 + "\n MUSICO SUBSTITUTO: "
                    + substituto;
        } else {
            return "\nDueto: " + nome + "\n\nMUSICO 1" + titular1 + "\n\nMUSICO 2:" + titular2;
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Musico getTitular1() {
        return titular1;
    }

    public void setTitular1(Musico titular1) {
        this.titular1 = titular1;
    }

    public Musico getTitular2() {
        return titular2;
    }

    public void setTitular2(Musico titular2) {
        this.titular2 = titular2;
    }

    public Musico getSubstituto() {
        return substituto;
    }

    public void setSubstituto(Musico substituto) {
        this.substituto = substituto;
    }

}

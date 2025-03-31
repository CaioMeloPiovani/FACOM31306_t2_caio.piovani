public class Musico {
    private String nome;
    private String papel;
    private int experiencia;// anos
    private double remuneracao; // por hora

    public Musico(String nome, String papel, int experiencia, double remuneracao) {
        this.nome = nome;
        this.papel = papel;
        this.experiencia = experiencia;
        this.remuneracao = remuneracao;
    }



    public String toString() {
        return "\nNOME: " + nome + "\nPAPEL: " + papel + "\nEXPERIENCIA: " + experiencia + "\nREMUNERACAO: " + remuneracao;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
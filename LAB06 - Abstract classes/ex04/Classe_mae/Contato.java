package ex04.Classe_mae;

public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
        
    }

    //public void 

    public String imprimirBasico(){
            return "NOME: " + nome + "\nAPELIDO: " + apelido + "\nEMAIL: " + email + "\nANIVERSARIO:" + aniversario;

    }

    public abstract void imprimirContato();

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
}

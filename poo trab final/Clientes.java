

public class Clientes extends Pessoa {
    // private String cpf;
    // private String nome;
    // private String endereco;
    private String estadoCivil;
    private String escolaridade;
    // private String dataNascimento;

    private Agencia agencia;

    public Clientes(String cpf, String nome, String endereco, String estadoCivil, String escolaridade,
            String dataNascimento) {
        super(cpf, nome, dataNascimento, endereco);
        // this.cpf = cpf;
        // this.nome = nome;
        // this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        // this.dataNascimento = dataNascimento;
    }

    public Clientes(String cpf, String nome) {
        super(cpf, nome, null, null);
    }

    ///////
 /// 

    public Clientes() {
        super(null, null, null, null);
    }

    //
    ///   @Override
    public String gerarResumo() {
        return "Cliente: " + getNome() + " | CPF: " + getCpf() + " | Escolaridade: " + getEscolaridade();
    }

    /// 
 /// 
    public Agencia getAgencia() {
        return agencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}
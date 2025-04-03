package ex1;

public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String cpf, String nome, double salario, double tetoSalarial) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    public void aumentoSalario(double percentual) {
        double novoSalario = salario + (salario * percentual / 100);

        if (novoSalario < 0) {
            throw new RuntimeException(" salario nao pode ser menor que zero");
        }
        if (novoSalario > tetoSalarial) {
            throw new RuntimeException("salario n pode passar o teto salarial");
        }

        salario = novoSalario;

    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
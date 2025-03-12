package ex05.funcionario;

public class Chefe extends Funcionario {
    private double salarioFixo;

    public Chefe(String nome, String dataNascimento, double salarioFixo) {
        super(nome, dataNascimento, salarioFixo);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}


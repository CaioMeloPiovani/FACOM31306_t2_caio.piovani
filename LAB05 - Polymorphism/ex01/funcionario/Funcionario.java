package ex01.funcionario;

public class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected double salario;

    public Funcionario(String nome, String dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }
 
    public String funcao(){
       return funcao();
    }

    public void exibirSalario() {
        System.out.println(funcao() + nome + " - Salário: R$ " + calcularSalario());
    }

    
    @Override
    public String toString(){
        return "NOME: " + nome + "DATA NASCIMENTO: " + dataNascimento + "SALARIO: " + salario;
    }
}
package ex05.funcionario;

public class Horista extends Funcionario {
    private double valorPorHora;
    private double horasTrabalhadas;

    public Horista(String nome, String dataNascimento, double valorPorHora, double horasTrabalhadas){
        super(nome, dataNascimento, valorPorHora);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double calcularSalario(){
        return  valorPorHora * horasTrabalhadas;

    }
}

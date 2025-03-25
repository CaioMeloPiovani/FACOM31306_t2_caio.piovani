package ex01.funcionario;

public class Operario extends Funcionario {
    private double valorPorProducao;
    private double quantidadeProduzida;

    public Operario(String nome, String dataNascismento, double valorPorProducao, double quantidadeProduzida){
        super(nome, dataNascismento, valorPorProducao);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;

    }

    public String funcao(){
        return "Operario | ";
    }


    @Override
    public double calcularSalario(){
        return valorPorProducao * quantidadeProduzida;
    }
    
}
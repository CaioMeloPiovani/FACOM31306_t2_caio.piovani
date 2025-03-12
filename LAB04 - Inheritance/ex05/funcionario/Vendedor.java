package ex05.funcionario;

public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double valorFixo, double comissao, double vendas) {
        super(nome, dataNascimento, valorFixo);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        //System.out.printf("%f + (%f * %f)", valorFixo, comissao, vendas);
        return valorFixo + (comissao * vendas);
    }
}



public class ContaPoupanca extends Conta {
    private double rendimentoMes;

    public ContaPoupanca(String numeroConta, double saldoAtual, String dataAbertura, String dataUltimaMovimentacao,
            String senha, boolean status,
            double rendimentoMes, Agencia agenciaDaConta) {
        super(numeroConta, saldoAtual, dataAbertura, dataUltimaMovimentacao, senha, status, agenciaDaConta);
        this.rendimentoMes = rendimentoMes;
        setTipo("Conta Poupança");
    }

    public double getrendimentoMes() {
        return rendimentoMes;
    }

    public void setrendimentoMes(double rendimentoMes) {
        this.rendimentoMes = rendimentoMes;
    }
}
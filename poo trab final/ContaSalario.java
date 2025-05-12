
public class ContaSalario extends Conta {
    private double limParaSaque;
    private double LimTransferencia;

    public ContaSalario(String numeroConta, double saldoAtual, String dataAbertura, String dataUltimaMovimentacao,
            String senha, boolean status,
            double LimTransferencia, double limParaSaque, Agencia agenciaDaConta) {
        super(numeroConta, saldoAtual, dataAbertura, dataUltimaMovimentacao, senha, status, agenciaDaConta);
        this.limParaSaque = limParaSaque;
        this.LimTransferencia = LimTransferencia;
        setTipo("Conta Salário");
    }

    public double getLimParaSaque() {
        return limParaSaque;
    }

    public void setLimParaSaque(double limParaSaque) {
        this.limParaSaque = limParaSaque;
    }

    public double getLimTransferencia() {
        return LimTransferencia;
    }

    public void setLimTransferencia(double limTransferencia) {
        LimTransferencia = limTransferencia;
    }

}
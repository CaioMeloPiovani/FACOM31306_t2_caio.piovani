

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private double taxaAdministrativa;

    public ContaCorrente(String numeroConta, double saldoAtual, String dataAbertura, String dataUltimaMovimentacao,
            String senha, boolean status,
            double limiteChequeEspecial, double taxaAdministrativa, Agencia agenciaDaConta) {
        super(numeroConta, saldoAtual, dataAbertura, dataUltimaMovimentacao, senha, status, agenciaDaConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.taxaAdministrativa = taxaAdministrativa;
        setTipo("Conta Corrente");
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTaxaAdministrativa() {
        return taxaAdministrativa;
    }

    public void setTaxaAdministrativa(double taxaAdministrativa) {
        this.taxaAdministrativa = taxaAdministrativa;
    }

}
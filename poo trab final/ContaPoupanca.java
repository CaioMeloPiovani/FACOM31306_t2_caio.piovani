public class ContaPoupanca extends Conta{
    private double rendimenteMes;
    
    public ContaPoupanca(String numeroConta, double saldoAtual, String dataAbertura, String dataUltimaMovimentacao, String senha, boolean status,
     double rendimenteMes, Agencia agenciaDaConta){
        super(numeroConta, saldoAtual, dataAbertura, dataUltimaMovimentacao, senha, status, agenciaDaConta);
        this.rendimenteMes = rendimenteMes;
    }


    public double getRendimenteMes() {
        return rendimenteMes;
    }

    public void setRendimenteMes(double rendimenteMes) {
        this.rendimenteMes = rendimenteMes;
    }    
}
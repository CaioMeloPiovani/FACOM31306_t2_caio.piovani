
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class Conta implements Serializable {
    private String numeroConta;
    private double saldoAtual;
    private String dataAbertura;
    private String dataUltimaMovimentacao;
    private String senha;
    private boolean status;
    private String tipo;

    private Agencia agenciaDaConta;

    public Conta(String numeroConta, double saldoAtual, String dataAbertura, String dataUltimaMovimentacao,
            String senha, boolean status,
            Agencia agenciaDaConta) {
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
        this.dataAbertura = dataAbertura;
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
        this.senha = senha;
        this.status = status;
        this.agenciaDaConta = agenciaDaConta;

    }

    // STATUS DA CONTA
    public boolean statusConta(boolean status) {
        return status;// verd e falso
    }

    // VERIFICAR SENHA ASSOCIADA
    public boolean verificarSenha(String senhaInformada) {
        if (senhaInformada.equals(this.senha)) {
            return true;
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
            return false; // Senha incorreta
        }

    }

    private List<Clientes> clientes = new ArrayList<>();

    public void adicionarCliente(Clientes cliente) {
        if (clientes.contains(cliente)) {
            System.out.println("Cliente já está associado a esta conta.");
        } else if (clientes.size() < 2) {
            clientes.add(cliente);
        } else {
            System.out.println("Conta já possui dois clientes associados.");
        }
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    private List<Transacao> transacaoes = new ArrayList<>();

    public void transacao(Transacao transacao) {
        switch (transacao.getTipo()) {
            case "SAQUE":
                if (saldoAtual >= transacao.getValor()) {
                    saldoAtual -= transacao.getValor();
                    transacaoes.add(transacao);
                } else {
                    System.out.println("Saldo insuficiente, transacao nao pode ser realizada.");
                }
                break;
            case "DEPOSITO":
                saldoAtual += transacao.getValor();
                transacaoes.add(transacao);
                break;
            case "TRANSFERENCIA":
                if (saldoAtual >= transacao.getValor()) {
                    saldoAtual -= transacao.getValor();
                    transacaoes.add(transacao);
                } else {
                    System.out.println("Saldo insuficiente para realizar o pagamento");
                }
                break;
            case "SALDO":
                System.out.println("SALDO ATUAL: " + saldoAtual);
                break;
            default:
                break;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataUltimaMovimentacao() {
        return dataUltimaMovimentacao;
    }

    public void setDataUltimaMovimentacao(String dataUltimaMovimentacao) {
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Agencia getAgenciaDaConta() {
        return agenciaDaConta;
    }

    public void setAgenciaDaConta(Agencia agenciaDaConta) {
        this.agenciaDaConta = agenciaDaConta;
    }

    public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

}

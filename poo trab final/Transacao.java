public class Transacao {
    private String tipo;
    private double valor;
    private String data;
    
    private Conta conta;

    public Transacao(String tipo, double valor, String data, Conta conta){
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.conta = conta;
    }

    public Conta getConta(){
        return conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
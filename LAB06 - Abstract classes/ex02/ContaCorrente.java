package ex02;

public abstract class ContaCorrente {
    private float saldo;
    private int estado; // 1 = conta ativa ||| 2 = conta desativa
    private int numConta;
    private int senha;

    public ContaCorrente(float saldo, int estado, int numConta, int senha){
        this.saldo = saldo;
        this.estado = estado;
        this.numConta = numConta;
        this.senha = senha;
    }

    public boolean debitarValor(float val, int pwd){
        if (pwd != senha)
            return (false);
        if (estado != 1)
            return (false);
        if (val > saldo)
            return (false);
        if(val <= 0)
            return false;

        saldo -= val;
        if(saldo == 0) estado = 2;//TORNAR CONTA INATIVA
            return true;
    }

    
    public int getNumConta() {
        return numConta;
    }

    public float getSaldo(int pwd){
        if (senha == pwd)
            return saldo;
                else 
                    return -1; //Senha provavelmnte errada
    }



    public void creditaValor(int pwd, float val){
        if (senha == pwd) {
            if (estado != 1) {
                System.out.println("Conta inativa.");
                return;
            }
            saldo += val;
        } else {
            System.out.println("Senha incorreta.");
        }
    }
    

    public int getEstado(int pwd) { 
        if (senha == pwd)
            return estado;
                else
                    return -1; // erro
    }

    protected void setEstado(int pwd, int e){
        if(senha == pwd)
            estado = e;
    }

    protected boolean isSenha(int pwd){
        if(senha == pwd)
            return true;
                else
                    return false;
    }

}

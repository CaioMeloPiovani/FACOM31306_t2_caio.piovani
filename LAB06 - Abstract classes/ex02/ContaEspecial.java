package ex02;

public class ContaEspecial extends ContaCorrente{
    private float limite;//limite credito
    
    public ContaEspecial(float saldo, int estado, int numConta, int senha, float limite){
        super(saldo, estado, numConta, senha);
        this.limite = limite;
    } 
        
    public ContaCorrente setLimite(int senha, int limite){
        if(!isSenha(senha)){
            System.out.println("senha incorreta.");
            return this;
}
        if(limite == 0) {
            return new ContaComum(getSaldo(senha), getEstado(senha), getNumConta(), senha);
        }

        this.limite = limite;
        return this;
    }

    public float getSaldo(int senha){
        if(isSenha(senha)){
            return super.getSaldo(senha);
    }
        return -1;
    }

    public float getLimite() {
        return limite;
    }
    

}



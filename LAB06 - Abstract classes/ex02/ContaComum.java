package ex02;

public class ContaComum extends ContaCorrente {

    public ContaComum(float saldo, int estado, int numConta, int senha){
        super(saldo, 1, numConta, senha);//estado = 1

    }

}


package ex2;

public class DivisaPorZeroException extends Exception{
    private String mensagem;

    public DivisaPorZeroException(String mensagem){
        super(mensagem);//nao entendi ainda pq tem que ter o super aqui
    }
    
}

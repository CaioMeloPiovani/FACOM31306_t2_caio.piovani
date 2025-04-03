package ex2;

public class Operacao {
    private int numerador;
    private int denominador;

    public Operacao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void iniciarOperacao(int numerador, int denominador){
        int resultado;
        try{
            resultado = calcular(numerador, denominador);
                System.out.println(" resposta = " + resultado);
        } catch (DivisaPorZeroException erro){
            System.out.println(erro.getMessage());
        }

    }

    public int calcular(int numerador, int denominador) throws DivisaPorZeroException{
        return dividir(numerador, denominador);
    }

    public int dividir(int numerador, int denominador) throws DivisaPorZeroException{
        if(denominador > 0){
            throw new DivisaPorZeroException("Divisao por zero n pode");
        }
        
        return numerador / denominador;
    }



    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

}

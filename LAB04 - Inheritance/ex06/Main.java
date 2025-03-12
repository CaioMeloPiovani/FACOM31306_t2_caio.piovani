package ex06;

import ex06.ingresso.CamaroteInferior;
import ex06.ingresso.CamaroteSuperior;
import ex06.ingresso.Normal;
import ex06.ingresso.Vip;

public class Main {
    public static void main(String[] args) {

        Normal ingressoNormal = new Normal(50.0);
        ingressoNormal.exibirValor();

        Vip ingressoVip = new Vip(100.0, 50.0);
        ingressoVip.exibirValor();

 
        CamaroteInferior camaroteInferior = new CamaroteInferior(400.0, 50.0, "Entrada pela area VIP fiel torcida, proximo ao setor corinthians");
        camaroteInferior.imprimeLocalizacao();
        camaroteInferior.exibirValor();
        
     

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(600.0, 80.0, 50.0);
        camaroteSuperior.exibirValor();
    }
}
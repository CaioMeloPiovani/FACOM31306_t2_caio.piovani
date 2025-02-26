package ex06;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Candidato[] candidatos = new Candidato[3];
        int op;
        int cand;

//Criacao candidatos
        candidatos[0] = new Candidato("Andre Luiz Ribeiro Maia", "09/08/1984","MASCULINO", 666608.00, 25, "Prefeito - Filadélfia/ BA", false);
        candidatos[1] = new Candidato("ANTONIO BARBOSA DOS SANTOS JUNIOR", "23/07/1988","MASCULINO", 145500.00, 55, "Prefeito - Filadélfia/ BA", false);
        candidatos[2] = new Candidato("JOÃO BATISTA PEREIRA", "02/12/1965","MASCULINO", 40000.00, 44888, "Vereador - Filadélfia/ BA", true);
/* 
        Candidato[] candidatos2 = new Candidato[3];
        candidatos2[0] = new Candidato("RICARDO AUGUSTO MACHADO DA SILVA", "01/09/1985","MASCULINO", " 1.884.822,98", 55, "Prefeito - Ribeirão Preto/ SP", false);
        candidatos2[1] = new Candidato("MARCO AURELIO MARTINS DE SOUSA", "04/07/1970","MASCULINO", " 9.544.787,14", 30, "Prefeito - Ribeirão Preto/ SP", false);
        candidatos2[2] = new Candidato("LUIZ CLAUDIO LUZ DA CONCEIÇÃO", "15/03/1972","MASCULINO", " 181.200,00", 40444, "Vereador - Ribeirão Preto/ SP", false);

*/
//criar dados eleicao(municipio, )

        Eleicao eleicao = new Eleicao("Filadélfia/ BA", 13000, candidatos);
      //  Eleicao eleicao2 = new Eleicao("Ribeirão Preto/ SP", 477595, candidatos2);
        

        eleicao.exibirEleicao();

        eleicao.exibirCandidatoMaiorPatrimonio();
     //   eleicao2.exibirEleicao();


    }



}
package ex04;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Candidato[] candidatos = new Candidato[3];
        int op;
        int cand;


        candidatos[0] = new Candidato("Andre Luiz Ribeiro Maia", "09/08/1984","MASCULINO", "666.608,15", 25, "Prefeito - Filadélfia/ BA", false);
        candidatos[1] = new Candidato("ANTONIO BARBOSA DOS SANTOS JUNIOR", "23/07/1988","MASCULINO", "R$ 145.500,00", 55, "Prefeito - Filadélfia/ BA", false);
        candidatos[2] = new Candidato("JOÃO BATISTA PEREIRA", "02/12/1965","MASCULINO", "R$ 40.000,00", 44888, "Vereador - Filadélfia/ BA", true);


        /*
        Candidato c1 = new Candidato();
        c1.setNome("ANDRÉ LUIZ RIBEIRO MAIA");
        c1.setDataNasci("09/08/1984");
        c1.setGenero("MASCULINO");
        c1.setPatrimonio("R$ 666.608,15");
        c1.setNumeroPartido(25);
        c1.setCargoPretendido("Prefeito - Filadélfia/ BA");
        c1.setReeleicao(false);
        c1.exibirCandidato();


        Candidato c2 = new Candidato();
        c2.setNome("ANTONIO BARBOSA DOS SANTOS JUNIOR");
        c2.setDataNasci("23/07/1988");
        c2.setGenero("MASCULINO");
        c2.setPatrimonio("R$ 145.500,00");
        c2.setNumeroPartido(55);
        c2.setCargoPretendido("Prefeito - Filadélfia/ BA");
        c2.setReeleicao(false);
        c2.exibirCandidato();


        Candidato c3 = new Candidato();
        c3.setNome("JOÃO BATISTA PEREIRA");
        c3.setDataNasci("02/12/1965");
        c3.setGenero("MASCULINO");
        c3.setPatrimonio("R$ 40.000,00");
        c3.setNumeroPartido(44888);
        c3.setCargoPretendido("Vereador - Filadélfia/ BA");
        c3.setReeleicao(true);
        c3.exibirCandidato();
      */


        System.out.print("Deseja realizar alguma mudanca(1)SIM/(2)NAO: ");
        op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            System.out.println("Qual Candidato deseja (1) (2) (3)");
            cand = sc.nextInt();
            sc.nextLine();

            switch (cand) {
                case 1:
                    candidatos[0].alterarDados();
                    candidatos[0].exibirCandidato();
                    break;

                case 2:
                    candidatos[1].alterarDados();
                    candidatos[1].exibirCandidato();
                    break;

                case 3:
                    candidatos[2].alterarDados();
                    System.out.println("");
                    candidatos[2].exibirCandidato();
                    break;

                default:
                    System.out.println("Este candidato nao existe.");
                    break;
            }

        } else if (op == 2){
            System.out.println("Programa encerrado");
        }else{
            System.out.println("OPCAO INVALIDA!");
        }

    }



}
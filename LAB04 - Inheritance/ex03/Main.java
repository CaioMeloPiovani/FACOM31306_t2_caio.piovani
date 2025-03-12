package ex03;

import ex03.candidatos.Candidatos;
import ex03.candidatos.Prefeitos;
import ex03.candidatos.Vereadores;

class Main {
    public static void main(String[] args) {

        Candidatos[] candidatos = new Candidatos[4];

        // Instanciando prefeitos
        candidatos[0] = new Prefeitos("Andre Luiz Ribeiro Maia", "09/08/1984", "MASCULINO", "Partido Renovação Democrática - PRD", 25, "Rodrigo Da Farmacia", 666608.00, false);
        candidatos[1] = new Prefeitos("ANTONIO BARBOSA DOS SANTOS JUNIOR", "23/07/1988", "MASCULINO", "Partido Social Democrático - PSD", 55, "Batista", 145500.00, false);

        // Instanciando vereadores
        candidatos[2] = new Vereadores("JOÃO BATISTA PEREIRA", "02/12/1965", "MASCULINO", "União Brasil - UNIÃO", "44888", "BAIRRO DO JOÃO BARBOSA NETO (ESTADIO)", 40000.00, true);
        candidatos[3] = new Vereadores("AGEU CERQUEIRA DOS SANTOS", "17/02/1987", "MASCULINO", "Partido Da Social Democracia Brasileira - PSDB", "45111", "BAIRRO CENTRAL FILADELFIA", 66000.00, false);

        System.out.println(" ==== CANDIDATOS A PREFEITO ====\n");
        for (int i = 0; i < 2; i++) {
            candidatos[i].exibirDados();   
            System.out.println("");   
        }

        System.out.println(" ==== CANDIDATOS A VEREADOR ====\n");
        for(int i = 2; i < 4; i++) {
            candidatos[i].exibirDados();
            System.out.println();
        }
    }
}

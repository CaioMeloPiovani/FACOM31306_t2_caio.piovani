package ex01;


public class Main {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);


        CandidatoPrefeito[] candidatosPrefeito = new CandidatoPrefeito[2];
        CandidatoVereador[] candidatosVereador = new CandidatoVereador[2];
       // int op = 0;
        //int prefeitoOUvereador = 0;

//criar candidatos p prefeito
        candidatosPrefeito[0]  = new CandidatoPrefeito("Andre Luiz Ribeiro Maia", "09/08/1984","MASCULINO", "Partido Renovação Democrática - PRD", 25, "Rodrigo Da Farmacia", 666608.00, false);
        candidatosPrefeito[1] = new CandidatoPrefeito("ANTONIO BARBOSA DOS SANTOS JUNIOR", "23/07/1988","MASCULINO", "Partido Social Democrático - PSD",55, "Batista", 145500.00, false);
        
//criar candidato VEREADOR
        candidatosVereador[0] = new CandidatoVereador("JOÃO BATISTA PEREIRA", "02/12/1965","MASCULINO", "União Brasil - UNIÃO", "44888", "BAIRRO DO JOÃO BARBOSA NETO (ESTADIO)", 40000.00, true);
        candidatosVereador[1] = new CandidatoVereador("AGEU CERQUEIRA DOS SANTOS", "17/02/1987", "MASCULINO", "Partido Da Social Democracia Brasileira - PSDB", "45111", "BAIRRO CENTRAL FILADELFIA", 66000.00, false);
    
        
        System.out.println(" ==== CANDIDATOS A PREFEITO ====");
        for (int i = 0; i < candidatosPrefeito.length; i++) {
            candidatosPrefeito[i].exibirCandidatoPrefeito();
            System.out.println();      
        }

        System.out.println("==== CANDIDATOS A VEREADOR =====");
        for (int i = 0; i < candidatosVereador.length; i++) {
            candidatosVereador[i].exibirCandidatoVereador();
            System.out.println();
           
        }

    }
}

  
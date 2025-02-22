import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Candidato[] candidatos = new Candidato[3];

        for(int i = 0; i < 3 ; i++){
            candidatos[i] = new Candidato();

            System.out.println("");
            System.out.println("Candidato numero: " + (i+1));// ( i + 1) p nao ficar bugar numero
            
            System.out.print("Nome do candidato: ");
            candidatos[i].nome = sc.nextLine();

            System.out.print("Data nascimento: ");
            candidatos[i].dataNasci = sc.nextLine();

            System.out.print("Genero: ");
            candidatos[i].genero = sc.nextLine();

            System.out.print("Patrimonio: ");
            candidatos[i].patrimonio = sc.nextLine();

            System.out.print("Numero Partido: ");
            candidatos[i].numeroPartido = sc.nextInt();
            sc.nextLine();

            System.out.print("Cargo pretendido: ");
            candidatos[i].cargoPretendido = sc.nextLine();

            System.out.print("Candidato disponível para reeleição (true/false): ");
            candidatos[i].reeleicao = sc.nextBoolean();
            sc.nextLine();

        }

        for (int i = 0; i < 3; i++) {
            candidatos[i].exibirCandidato();

        }

        sc.close();
    }
}

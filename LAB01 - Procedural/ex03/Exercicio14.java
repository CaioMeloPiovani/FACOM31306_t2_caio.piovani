import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantAlunos;
        //int numero;
        //char classeSocial;
       // float cra;



        do {
            System.out.print("Quantos alunos serao cadastrados(MAX 10000): ");
            quantAlunos = sc.nextInt();

                if (quantAlunos > 10000) {
                System.out.println("Quantidade de alunos ultrapassou o limite.");
                }   
            } while (quantAlunos > 10000);


        int vetor[] = new int[quantAlunos];
        int numero[] = new int[quantAlunos];
        char classeSocial[] = new char[quantAlunos];
        float cra[] = new float[quantAlunos];


            System.out.println("\nPreencha os Dados dos Alunos");
        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Numero do aluno: ");
            numero[i] = sc.nextInt();
            //vetor[i] = numero;

            sc.nextLine();

            System.out.printf("Classe social do aluno %d: ", numero[i]);
            classeSocial[i] = sc.next().charAt(0);

            System.out.printf("CRA do aluno %d: ", numero[i]);
            cra[i] = sc.nextFloat();

        }

        System.out.println("\n=-=-= ALUNOS CADASTRADOS =-=-=");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Numero - %d  -  Classe Social: %c  -  CRA: %.2f\n", numero[i], classeSocial[i], cra[i]);
        }



        sc.close();
    }
    
}
/*
 *classeSocial = sc.next().charAt(0); p/ conseguir ler um char

 * 
 */
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantAlunos;
        float media = 0;
        //int notas;
        float soma = 0;

        do {
            System.out.print("Quantidade de alunos(MAX 100): ");
            quantAlunos = sc.nextInt();

            if (quantAlunos > 100) {
                System.out.println("Quantidade de alunos ultrapassou o limite.");
            }

        
        } while (quantAlunos > 100);


        float vetor[] = new float[quantAlunos];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Preencha a nota do aluno(%d/%d): ", (i+1), (vetor.length));
            vetor[i] = sc.nextFloat();

            soma += vetor[i];
            
        }

        media = soma / quantAlunos;

        
        System.out.println("MEDIA DA TURMA = " + media);




        sc.close();
    }

}
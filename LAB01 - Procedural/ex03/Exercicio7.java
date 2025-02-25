import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float vetor[] = new float[5];
        float maiorNota;
        float x;
        float notaNormalizada[] = new float[5];

        maiorNota = vetor[0];

        System.out.println("Insira as notas dos alunos");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Nota do aluno %d: ", i+1);
            vetor[i] = sc.nextFloat();
            
            if(vetor[i] > maiorNota){
                maiorNota = vetor[i];
            }
        }

        x = 100/maiorNota;

        for(int i = 0; i < 5; i++){
            notaNormalizada[i] = vetor[i] * x;

        }

        System.out.println("\nNOTAS JA NORMALIZADAS(LIMITE 100)");

        for (int i = 0; i < 5; i++) {
            System.out.printf(" Nota do aluno %d = %f \n", i+1, notaNormalizada[i]);
            
        }



        sc.close();
    }

}

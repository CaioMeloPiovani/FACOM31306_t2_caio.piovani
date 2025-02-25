import java.util.Scanner;

public class Exercicio8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            float vetor[] = new float[5];
            float soma = 0;
            float media = 0;
            float somatoria = 0;
            double somatoriaDivP5 = 0;
            double desvioPadrao = 0;


            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Nota do aluno %d: ", i+1);
                vetor[i] = sc.nextFloat();

            }

            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];

            }

            media = soma / vetor.length;

            for (int i = 0; i < vetor.length; i++) {
                somatoria += (vetor[i] - media) * (vetor[i] - media);
                
            }


            somatoriaDivP5 = somatoria/(vetor.length - 1);

            desvioPadrao = Math.sqrt(somatoriaDivP5);



            System.out.printf("MEDIA = %.1f\n", media);
            System.out.printf(" DESVIO PADRAO = %f", desvioPadrao);

          sc.close();
        }

      //  sc.close();
}

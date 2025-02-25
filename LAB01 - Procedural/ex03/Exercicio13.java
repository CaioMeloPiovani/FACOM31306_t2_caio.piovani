import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.println("Preencha o vetor ");

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Vetor(%d/5): ", i+1);
            vetor[i] = sc.nextInt();

            if(vetor[i] < 0){
                vetor[i] = 0;
            }
        }
        
        System.out.println("Zerando os vetores negativos\n");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("vetor(%d/5) -> %d\n", (i+1), vetor[i]);

        }

        sc.close();
    }
}
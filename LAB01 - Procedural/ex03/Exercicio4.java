import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[6];

        System.out.println("Preencha o vetor de 6 elementos com valores PARES: ");

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Vetor(%d/6) = ", (i+1));
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 != 0) {
                System.out.println("Valor impar, preencha com par.");
                System.out.printf("Vetor(%d/6) = ", (i+1));
                vetor[i] = sc.nextInt();
            } 

        }

        System.out.println("OS VALORES PARES DIGITADOS FORAM: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d] = %d | ", i, vetor[i]);
        }
        sc.close();

}
}
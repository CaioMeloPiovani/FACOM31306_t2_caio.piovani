import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[6];

        System.out.println("Preencha o vetor de 6 elementos");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor(%d/6): ", (i+1));
            vetor[i] = sc.nextInt();
        }
        System.err.println("OS VETORES LIDOS FORAM:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            
        }
        sc.close();
    }
}

/*
 * Anot
 * printF p conseguir usar o %d
 * linha 16 = uso do + " " p ter um espaco entre cada elemento do vetor
 */
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[8];
        int repetecos[] = new int[8]; 
        int cont = 0;

        System.out.println("Preencha o vetor:");

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Vetor (%d/8) - ", (i + 1));
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {

                if (vetor[i] == vetor[j]) {
                    boolean jaRegistrado = false;

                    for (int k = 0; k < cont; k++) {
                        if (repetecos[k] == vetor[i]) {
                            jaRegistrado = true;
                            break;
                        }
                    }

                    if (!jaRegistrado) {
                        repetecos[cont] = vetor[i];
                        cont++;
                    }
                }
    }
}


        if (cont > 0) {

            System.out.print("Valores repetidos: ");
            for (int i = 0; i < cont; i++) {

                System.out.print(repetecos[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Nenhum valor repetido encontrado.");
            
        }

        sc.close();
    }
}

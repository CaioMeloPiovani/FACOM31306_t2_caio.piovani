import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[8];
        int repetecos[] = new int[8];
        int quantRepetecos[] = new int[8]; 
        int cont = 0;

        System.out.println("Preencha o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor (%d/8) - ", (i + 1));
            vetor[i] = sc.nextInt();
        }

 
        for (int i = 0; i < vetor.length; i++) {
            int contador = 1; 
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }

            if (contador > 1) { 
                boolean jaRegistrado = false;

                
                for (int k = 0; k < cont; k++) {
                    if (repetecos[k] == vetor[i]) {
                        jaRegistrado = true;
                        break;
                    }
                }

                if (!jaRegistrado) {
                    repetecos[cont] = vetor[i];
                    quantRepetecos[cont] = contador;
                    cont++;
                }
            }
        }

  
        if (cont > 0) {

            System.out.println("Valores repetidos");

            for (int i = 0; i < cont; i++) {

                System.out.println(repetecos[i] + " aparece " + quantRepetecos[i] + " vezes");

            }
        } else {
            System.out.println("Nenhum valor repetido encontrado.");

        }

        
        sc.close();
    }
}

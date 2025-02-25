import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior, menor;
        int soma;
        float media;
        int indiceMaior = 0;
        int indiceMenor = 0;
        

        System.out.println("Preencha o vetor de 5 elementos: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor(%d/5) = ", (i+1));
            vetor[i] = sc.nextInt();
    }

        maior = vetor[0];
        menor = vetor[0];
        soma = 0;
        media = 0;

        System.out.println("Os numeros digitados foram: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
           
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
            if(vetor[i] < menor){
                menor = vetor[i];
                indiceMenor = i;
            }

            soma = soma + vetor[i];
            media = soma / vetor.length;

        }

        System.out.println(" ");
        System.out.printf("MENOR VETOR EH: %d, LOCALIZADO NO INDICE: %d \n", menor, indiceMenor);
        System.out.printf("MAIOR VETOR EH: %d, LOCALIZADO NO INDICE: %d \n", maior, indiceMaior);

        System.out.printf("MEDIA DOS VETORES: %.2f\n", media);
        
        sc.close();

}
    

}

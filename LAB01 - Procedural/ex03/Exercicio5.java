import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior, menor;
        int soma = 0;
        float media;
        

        System.out.println("Preencha o vetor de 5 elementos: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor(%d/5) = ", (i+1));
            vetor[i] = sc.nextInt();
    }

        maior = vetor[0];
        menor = vetor[0];
        //soma = 0;
        media = 0;

        System.out.println("Os numeros digitados foram: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
           
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }

            soma = soma + vetor[i];
            media = soma / vetor.length;

        }

        System.out.println(" ");
        System.out.println("MAIOR : " + maior);
        System.out.println("MENOR : " + menor);
        System.out.printf("MEDIA DOS VETORES: %.2f\n", media);
        
        sc.close();

}
}

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vermelha;
        int azul;
        int amarela;
        int verde;
        int totalBolinhas;

        float maiorProbabilidade = 0;
        String maior = "";

        float mediaVermelha;
        float mediaAzul = 0;
        float mediaAmarela = 0;
        float mediaVerde = 0;


        System.out.println("Digite a Quantidade de Bolinhas existente da cada cor.");
        System.out.print("Bolinhas Vermelhas: ");
        vermelha = sc.nextInt();

        System.out.print("Bolinhas Azuis: ");
        azul = sc.nextInt();

        System.out.print("Bolinhas verdes: ");
        verde = sc.nextInt();

        System.out.print("Bolinhas amarelas: ");
        amarela = sc.nextInt();

        totalBolinhas = vermelha + azul + verde + amarela;

        mediaVermelha = ((float)vermelha / totalBolinhas)* 100;
        mediaAzul = ((float)azul / totalBolinhas) * 100;
        mediaAmarela = ((float)amarela / totalBolinhas) * 100;
        mediaVerde = ((float) verde / totalBolinhas) * 100;

        maiorProbabilidade = mediaVermelha;
        maior = "Vermelho";

        if(mediaAmarela > maiorProbabilidade ){
            maiorProbabilidade = mediaAmarela;
            maior = "Amarela";
        }
        if(mediaVerde > maiorProbabilidade){
            maiorProbabilidade = mediaVerde;
            maior = "Verde";
        }
        if(mediaAzul > maiorProbabilidade){
            maiorProbabilidade = mediaAzul;
            maior = "Azul";
        }
        
        System.out.println("\nProbabilidades");
        System.out.printf("Vermelha - %.2f%% \n", mediaVermelha);
        System.out.printf("Azul - %.2f%% \n", mediaAzul);
        System.out.printf("Amarela - %.2f%% \n", mediaAmarela);
        System.out.printf("Verde - %.2f%% \n\n", mediaVerde);

        System.out.printf("A cor %s possui probabilidade com %.2f", maior, maiorProbabilidade);
        

        //System.out.printf("%d\n", totalBolinhas);
    



        sc.close();
    }

}


/*
 * 12)	Uma piscina de bolinhas possui bolas azuis, verdes, amarelas e vermelhas.
 *  Faça um programa em que o usuário digita a quantidade de bolinhas de cada cor existente
 *  em uma piscina e mostra a probabilidade de ocorrência de cada cor, indicando qual possui a maior probabilidade
 */
import java.util.Scanner;
public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[6];

        System.out.println("Preencha o vetor com 6 numeros: ");
        System.out.print("elemento (1/6) ->  " );
        vetor[0] = sc.nextInt();


        System.out.print("elemento (2/6) ->  " );
        vetor[1] = sc.nextInt();

        System.out.print("elemento (3/6) ->  " );
        vetor[2] = sc.nextInt();

        System.out.print("elemento (4/66) ->  " );
        vetor[3] = sc.nextInt();

        System.out.print("elemento (5/6) ->  " );
        vetor[4] = sc.nextInt();

        System.out.print("elemento (6/6) ->  " );
        vetor[5] = sc.nextInt();
        System.out.println("" );

        System.out.println("VETORES LIDOS");

            System.out.println(vetor[0]);
            System.out.println(vetor[1]);
            System.out.println(vetor[2]);
            System.out.println(vetor[3]);
            System.out.println(vetor[4]);
            System.out.println(vetor[5]);
            sc.close();
        }

      //  sc.close();
}
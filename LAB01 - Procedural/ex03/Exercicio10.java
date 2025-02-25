import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetA[] = new int[3];
        int vetB[] = new int[3];
        int vetC[] = new int[3];

        for(int i = 0; i < vetA.length; i++){
            System.out.printf("Digite o valor(%d/%d): ", (i+1), vetA.length);
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetB.length; i++) {
            System.out.printf("Digite o valor(%d/%d): ", (i+1), vetB.length);
            vetB[i] = sc.nextInt();
        }

        System.out.print("Vetor C definido como: ");
        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = vetA[i] - vetB[i];

            System.out.print(vetC[i] + " ");
            
        }

        


        sc.close();
    }
}

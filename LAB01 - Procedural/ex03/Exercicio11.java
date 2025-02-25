import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v[] = new int[5];
        int vPar[] = new int[5];
        int vImpar[] = new int[5];
        int vParAux = 0;
        int vImpAux = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite um valor(%d/%d): ", (i+1), v.length);
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if(v[i] % 2 == 0){
                vPar[vParAux] = v[i];
                vParAux++;
            } else{
                vImpar[vImpAux] = v[i] ;
                vImpAux++;
            }
            
        }

        System.out.printf("PARES => ");
        for (int i = 0; i < vParAux; i++) {
            System.out.print(vPar[i] + " ");
            
        }

        System.out.printf("\nIMPARES => ");
        for (int i = 0; i < vImpAux; i++) {
            System.out.printf(vImpar[i] + " ");
            
        }

        sc.close();
    }
     
}

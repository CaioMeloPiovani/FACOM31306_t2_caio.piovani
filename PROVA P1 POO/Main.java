import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0; // quant de duetos
        String nomeDueto;
        Musico titular1, titular2, substituto;
        //Dueto duetoComSubs, duetoSemSubs;

        //Dueto[] duetos = new Dueto[n];
        System.out.print("Quantos Duetos deseja Cadastrar: ");
        n = sc.nextInt();
        sc.nextLine();

        Dueto[] duetos = new Dueto[n];

        System.out.println(" === Cadastro do Dueto === ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nome Dueto: ");
            nomeDueto = sc.nextLine();

            System.out.println("DADOS MUSICO 1");
            System.out.print("NOME: ");
            String nome1 = sc.nextLine();

            System.out.print("PAPEL: ");
            String papel1 = sc.nextLine();

            System.out.print("EXPERIENCIA: ");
            int experiencia1 = sc.nextInt();

            System.out.print("REMUNERACAO POR HORA: ");
            double remuneracao1 = sc.nextDouble();
            sc.nextLine();

            titular1 = new Musico(nome1, papel1, experiencia1, remuneracao1);

            System.out.println("DADOS MUSICO 2");
            System.out.print("NOME: ");
            String nome2 = sc.nextLine();

            System.out.print("PAPEL: ");
            String papel2 = sc.nextLine();

            System.out.print("EXPERIENCIA: ");
            int experiencia2 = sc.nextInt();

            System.out.print("REMUNERACAO POR HORA: ");
            double remuneracao2 = sc.nextDouble();
             sc.nextLine();

            titular2 = new Musico(nome2, papel2, experiencia2, remuneracao2);

            // substituto
            int sub;
            System.out.print("O DUETO TEM SUBSTITUTO? (0|NAO) (1|SIM)");
            sub = sc.nextInt();
            sc.nextLine();

            if (sub == 1) {
                System.out.println("DADOS MUSICO SUBSTITUTO");
                System.out.print("NOME: ");
                String nomeSubstituto = sc.nextLine();

                System.out.print("PAPEL: ");
                String papelSubstituto = sc.nextLine();

                System.out.print("EXPERIENCIA: ");
                int experienciaSubstituto = sc.nextInt();

                System.out.print("REMUNERACAO POR HORA: ");
                double remuneracaoSubstituto = sc.nextDouble();
                sc.nextLine();

                substituto = new Musico(nomeSubstituto, papelSubstituto, experienciaSubstituto, remuneracaoSubstituto);

                duetos[i] = new Dueto(nomeDueto, titular1, titular2, substituto);

            } else {
                System.out.println("");
                duetos[i] = new Dueto(nomeDueto, titular1, titular2);
            }

        }

        System.out.println("\n\n\nDUETOS CADASTRADOS");
            for(int i = 0; i < n; i++){
                System.out.println(duetos[i]);
            }

        Dueto maiorRemuneracao = duetos[0];
        for(int i = 1; i < n; i++){
            if(duetos[i].CalculoRemuneracao() > maiorRemuneracao.CalculoRemuneracao()){
                maiorRemuneracao = duetos[i];
            }
        }

        System.out.println("DUETO COM MAIOR REMUNERACAO POR HORA");
            System.out.println(maiorRemuneracao);

        for (int i = 0; i < duetos.length; i++) {
                duetos[i] = null;
                System.out.println(duetos[i]);
            }
            
        //System.out.println(duetos[i]);

        sc.close();
    }
}

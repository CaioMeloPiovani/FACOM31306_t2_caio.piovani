import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========= MENU DE ACESSO =========");
            System.out.println("1. Acesso Administrativo");
            System.out.println("2. Acesso Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    SistemaBancario.menuAdministrativo();
                    break;
                case 2:
                    SistemaBancario.menuCliente();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    return;
                default:
                    System.out.println("Opçao invalida.");
                
                sc.close();
            }
        }
    }
}
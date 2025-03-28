package ex04;

import ex04.Classe_mae.Contato;
import ex04.Classe_mae.Familia;
import ex04.Classe_mae.Trabalho;
import ex04.Classe_mae.Amigos;

import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo = 0;

        Contato[] contatos = new Contato[15];

        contatos[0] = new Familia("Jota", "Joao", "joaojota@gmail.com", "10/05/2000", "Primo");
        contatos[1] = new Familia("Le", "Leticia", "Leticia123@gmail.com", "10/01/1950", "Prima");
        contatos[2] = new Amigos("Craque", "Yuri Alberto", "yurialbertotimao@gmail.com", "15/03/2001", 1);
        contatos[3] = new Amigos("Holandes", "Memphis Depay", "memphisCoringao@gmail.com", "14/11/1995", 2);
        contatos[4] = new Amigos("CristianoRomero", "Romero", "romero11@gmail.com", "14/11/1994", 3);
        contatos[5] = new Familia("Tata", "Tauana", "TauanaPiovani@gmail.com", "12/01/1996", "irmao");
        contatos[6] = new Trabalho("Hellmanns", "Gabriel", "gabrielGrellmann@gmail.com", "05/01/2005", "colega");
        contatos[7] = new Trabalho("TORZAO", "Heitor", "HeitorMadeiras@gmail.com", "05/01/2015", "chefe");
        contatos[8] = new Familia("tio chico", "Clevis", "NAO TEM", "28/11/1970", "Tio");
        contatos[9] = new Familia("Bene", "Benedito", "benedito_bende1989", "28/11/1989", "Chefe");

        //contatos[8].imprimirContato();

        do {
            System.out.println("QUAIS TIPOS DE AMIGOS DESEJA EXIBIR?");
            System.out.println("TODOS OS CONTATOS (1)");
            System.out.println("FAMILIARES (2)");
            System.out.println("AMIGOS (3)");
            System.out.println("COLEGAS D TRABALHO(4)");
            System.out.println("APENAS MELHORES AMIGOS (5)");
            System.out.println("APENAS IRMAOS(6)");
            System.out.println("APENAS COLEGAS DE TRABALHO(7)");
            System.out.println("MOSTRAR UM CONTATO ESPECIFICO (8)");
            System.out.println("ENCERRAR PRGORAMA(0)");

            System.out.print("-> ");
            tipo = sc.nextInt();

            switch (tipo) {
                case 1:
                    for (Contato contato : contatos) {
                        contato.imprimirContato();
                        System.out.println("\n");
                    }
                    break;

                case 2:
                    for (Contato contato : contatos) {
                        if (contato instanceof Familia) {
                            contato.imprimirContato();
                            System.out.println("\n");
                        }
                    }
                    break;

                case 3:
                    for (Contato contato : contatos) {
                        if (contato instanceof Amigos) {
                            contato.imprimirContato();
                            System.out.println("\n");
                        }
                    }
                    break;
                case 4:
                    for (Contato contato : contatos) {
                        if (contato instanceof Amigos) {
                            contato.imprimirContato();
                            System.out.println("\n");
                        }
                    }
                    break;

                case 5:

                    for (Contato contato : contatos) {
                        if (contato instanceof Amigos) {
                            Amigos amigo = (Amigos) contato;
                            if (amigo.getGrau() == 1) {
                                amigo.imprimirContato();
                                System.out.println("\n");
                            }
                            System.out.println("aa");
                        }
                    }
                    break;

                case 6:
                    for (Contato contato : contatos) {
                        if (contato instanceof Familia) {
                            Familia familia = (Familia) contato;
                            if (familia.getParentesco() == "irmao") {
                                familia.imprimirContato();
                                System.out.println("\n");
                            }
                        }
                    }
                    break;

                case 7:
                    for (Contato contato : contatos) {
                        if (contato instanceof Trabalho) {
                            Trabalho trabalho = (Trabalho) contato;
                            if (trabalho.getCargo() == "colega") {
                                trabalho.imprimirContato();
                                System.out.println("\n");
                            }
                        }
                    }
                    break;

                case 8:
                    int x = 0;
                    System.out.println("Escolha qual contato deseja exibir: ");
                    x = sc.nextInt();
                    System.out.println();
                    if (contatos[x] instanceof Trabalho) {
                        System.out.println("TIPO -> Trabalho");
                        System.out.println("");

                    }
                    if (contatos[x] instanceof Amigos) {
                        System.out.println("TIPO -> Amigos");
                        System.out.println("");

                    }
                    if (contatos[x] instanceof Familia) {
                        System.out.println("TIPO -> Familia");
                        System.out.println("");

                    }

                    contatos[x].imprimirContato();
                    System.out.println();
                    break;
                
                case 0:
                    break;

                default:
                    System.out.println("OPCAO INVALIDA.");
                    System.out.println();
                    break;
            }

        } while (tipo != 0);

       sc.close();

    }

}
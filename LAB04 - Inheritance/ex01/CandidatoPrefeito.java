package ex01;

import java.util.Scanner;

public class CandidatoPrefeito {
    private String nome;
    private String dataNascimento;
    private String genero;
    private String partido;
    private int numeroPartido;
    private String vice;
    private double patrimonio;
    private boolean reeleicao;

    public CandidatoPrefeito(String nome, String dataNascimento, String genero, String partido, int numeroPartido, String vice, double patrimonio, boolean reeleicao){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.partido = partido;
        this.numeroPartido = numeroPartido;
        this.vice = vice;
        this.patrimonio = patrimonio;
        this.reeleicao = reeleicao;
    }

    public void exibirCandidatoPrefeito(){
        System.out.println("NOME: " + nome);
        System.out.println("DATA NASCIMENTO:" + dataNascimento);
        System.out.println("GENERO: " + genero);
        System.out.println("PATRIMONIO: " + patrimonio);
        System.out.println("PARTIDO: " + partido);
        System.out.println("NUMERO PARTIDO: " + numeroPartido);
        System.out.println("VICE: " + vice);
        if(reeleicao) {
            System.out.println("Candidato pode ser reeleito");
        } else {
            System.out.println("Candidato NAO pode ser reeleito");
        }
    }

    public void alterarDados(){
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("(1) Alterar Nome");
            System.out.println("(2) Alterar Data nascimento");
            System.out.println("(3) Alterar Genero");
            System.out.println("(4) Alterar Patrimonio;");
            System.out.println("(5) Alterar Partido");
            System.out.println("(6) Alterar Numero do Partido");
            System.out.println("(7) Alterar Vice");           
            System.out.println("(8) Alterar Status de Reeleicao");
            System.out.println("(0) Salvar mudancas");
            System.out.print("-> ");
            op = sc.nextInt();
            sc.nextLine(); // Consome a nova linha

            switch (op) {
                case 1:
                    System.out.print("Novo Nome: ");
                    setNome(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Nova Data de Nascimento: ");
                    this.dataNascimento = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Novo Genero: ");
                    this.genero = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Novo Patrimonio: ");
                    this.patrimonio = sc.nextDouble();
                    break;

                case 5:
                    System.out.print("Novo Partido: ");
                    sc.nextLine(); // Consome a nova linha
                    this.partido = sc.nextLine();
                    break;

                case 6:
                    System.out.print("Novo numero de partido: ");
                    this.numeroPartido = sc.nextInt();
                    break;

                case 7:
                System.out.print("Novo Vice: ");
                this.vice = sc.nextLine();
                break;

                case 8:
                    System.out.print("Novo Status de Reeleicao(true)/(false): ");
                    this.reeleicao = sc.nextBoolean();
                    break;

                case 0:
                    System.out.println("Mudanças encerradas.");
                    break;

                default:
                    System.out.println("Opção inválida! Digite uma nova opção.");
                    break;
            }
        } while (op != 0);

        sc.close(); // Fechando o scanner
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }


public String toString() {
    return "Candidato a Prefeito:\n" + "Nome: " + nome + "\n" + "Data de Nascimento: " + dataNascimento + "\n" + "Gênero: " + genero + "\n" + "Partido: " + partido + "\n" +"Número do Partido: " + numeroPartido + "\n" +"Vice: " + vice + "\n" + "Patrimônio: " + patrimonio + "\n" +"Reeleição: " + (reeleicao ? "Pode ser reeleito" : "Não pode ser reeleito");
}
}


/*
Assim, modifique o exercício de forma que sejam criadas duas classes. Uma chamada CandidatoPrefeito e outra CandidatoVereador.
 Essas classes devem possuir todos os atributos antes listados (exceto Cargo Pretendido) e mais alguns, específicos de cada uma.
  Para prefeito, o nome e partido do candidato a vice-prefeito.
   Para o vereador, o número de três dígitos (use string ao invés de tipos numéricos) e o bairro em que mora.
   Crie construtores que inicializam todos os atributos das classes. Crie também um método toString() para mostrar os dados dos candidatos.

Faça um programa principal que cria um candidato a prefeito e um a vereador, e mostre os dados criados.
 */
package ex04;
import java.util.Scanner;

class Candidato {
   // /*
    private String nome;
    private String dataNasci;
    private String genero;
    private String patrimonio;
    private int numeroPartido;
    private String cargoPretendido;
    private boolean reeleicao;
//*/
    public Candidato(String nome, String dataNasci, String genero, String patrimonio, int numeroPartido, String cargoPretendido, boolean reeleicao){
        this.nome = nome;
        this.dataNasci = dataNasci;
        this.genero = genero;
        this.patrimonio = patrimonio;
        this.numeroPartido = numeroPartido;
        this.cargoPretendido = cargoPretendido;
        this.reeleicao = reeleicao;
    }

    void exibirCandidato(){
        System.out.println("NOME: " + nome);
        System.out.println("DATA DE NASCIMENTO: " + dataNasci);
        System.out.println("GENERO: " + genero);
        System.out.println("PATRIMONIO: " + patrimonio);
        System.out.println("PATRIMONIO: " + numeroPartido);
        System.out.println("CARGO PRETENDIDO: " + cargoPretendido);

        if(reeleicao == true){
            System.out.println("Candidato pode ser reeleito");
        } else {
            System.out.println("Candidato NAO pode ser reeleito");
        }
        System.out.println("\n");


    }

    void alterarDados(){
        Scanner sc = new Scanner(System.in);

        int op;

        do {


            // System.out.println("");

            System.out.println("(1) Alterar Nome");
            System.out.println("(2) Alterar Data nascimento");
            System.out.println("(3) Alterar Genero");
            System.out.println("(4) Alterar Patrimonio;");
            System.out.println("(5) Alterar Numero do Partido");
            System.out.println("(6) Alterar Cargo Pretendido ");
            System.out.println("(7) Alterar Status de Reeleicao");
            System.out.println("(0) Salvar mudancas");
            System.out.print("-> ");
            op = sc.nextInt();
            sc.nextLine();






            switch (op) {

                case 1:
                    System.out.print("Novo Nome: ");
                    setNome(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Nova Data de Nascimento: ");
                    this.dataNasci = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Novo Genero: ");
                    this.genero = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Novo Patrimonio: ");
                    this.patrimonio = sc.nextLine();
                    break;

                case 5:
                    System.out.print("Novo Numero de Partido: ");
                    this.numeroPartido = sc.nextInt();
                    break;

                case 6:
                    System.out.print("Novo Cargo Pretendido: ");
                    this.cargoPretendido = sc.nextLine();
                    break;

                case 7:
                    System.out.print("Novo Status de Reeleicao(true)/(false): ");
                    this.reeleicao = sc.nextBoolean();
                    break;

                case 0:
                    System.out.print("mudancas encerradas");
                    break;


                default:
                    System.out.print("Opcao invalida! digite uma nova opcao.\n");
                    break;

            }
        }   while(op != 0);
    }






    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNasci() {
        return dataNasci;
    }
    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }
    public int getNumeroPartido() {
        return numeroPartido;
    }
    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }
    public String getCargoPretendido() {
        return cargoPretendido;
    }
    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }
    public boolean isReeleicao() {
        return reeleicao;
    }
    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }



}
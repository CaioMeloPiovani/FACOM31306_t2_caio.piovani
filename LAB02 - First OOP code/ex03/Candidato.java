public class Candidato  {
    String nome;
    String dataNasci;
    String genero;
    String patrimonio;
    int numeroPartido;
    String cargoPretendido;
    boolean reeleicao;

    void exibirCandidato(){
        System.out.println("");
        System.out.println("NOME: " + this.nome);
        System.out.println("DATA NASCIMENTO: " + this.dataNasci);
        System.out.println("GENERO: " + this.genero);
        System.out.println("PATRIMONIO: " + this.patrimonio);
        System.out.println("NUMERO PARTIDO: " + this.numeroPartido);
        System.out.println("CARGO PRETENDIDO: " + this.cargoPretendido);

        if(reeleicao == true){
            System.out.println("Candidato pode ser reeleito");
        } else {
            System.out.println("Candidato NAO pode ser reeleito");
        }
        System.out.println("\n");

    }

}
package ex05;

class Eleicao {
    private String municipio;
    private int numVotantes;
    private Candidato[] candidatos;

    public Eleicao(String municipio, int numVotantes, Candidato[] candidatos){
        this.municipio = municipio;
        this.numVotantes = numVotantes;
        this.candidatos = candidatos;
    }

    public void exibirEleicao(){
        System.out.println("====== DADOS DA CIDADE ======");
        System.out.println("Nome do municipio: " + municipio);
        System.out.println("Numero de votantes: " + numVotantes);
        System.out.println(" ");
        System.out.println("Candidatos: ");

        for (int i = 0; i < candidatos.length; i++) {
            candidatos[i].exibirCandidato();
            
        }
        System.out.println("");
    }

 }
    

/*
 * # Ex05
Crie uma nova classe chamada Eleição (Eleicao - evitar acentuação e cedilha),
 que é composta pelo nome do município, o número de votantes, os candidatos,
  e outras informações que julgar pertinente.
   Instancie duas Eleições (busque por outro município).
    Inicialize os dados dos objetos por meio dos construtores.
 Mostre na tela todos os dados cadastrados.
 */
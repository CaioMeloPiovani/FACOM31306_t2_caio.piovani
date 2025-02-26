package ex06;

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

    public void exibirCandidatoMaiorPatrimonio(){
        double maiorPatrimonio = 0;
        Candidato candidatoMaiorPatrimonio = null;

        for(Candidato candidato : candidatos){
            if(candidato.getPatrimonio() > maiorPatrimonio){
                maiorPatrimonio = candidato.getPatrimonio();
                candidatoMaiorPatrimonio = candidato;

            }

        }

        System.out.println("Candidato Com maior patrimonio: ");
        candidatoMaiorPatrimonio.exibirCandidato();
        
        double bensTotais = 0;

        for(Candidato candidato : candidatos){
            bensTotais += candidato.getPatrimonio();

        }
        

    }

 }
    

 /*
  *  indicando qual o percentual de bens ele possui em relação a todos os outros candidatos que estão concorrendo na eleição.

# Ex07
  */
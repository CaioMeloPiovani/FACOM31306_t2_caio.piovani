package ex03;

public class Universidade {
    private String nomeUniversidade;
    private String dataFundacao;
    private Estudante[] estudantes = new Estudante[100];
    private int contadorEstudantes = 0;


    public Universidade(String nomeUniversidade, String dataFundacao){
        this.nomeUniversidade = nomeUniversidade;
        this.dataFundacao = dataFundacao;
    }

    public void adicionarEstudante(Estudante estudante){
        if(contadorEstudantes < 100){
            estudantes[contadorEstudantes++] = estudante;
        }
    }


    public void contarEstudantesPorTipo(){
        int graduacao = 0, mestrado = 0, doutorado = 0;
        for(int i = 0; i < contadorEstudantes; i++){ 
            if(estudantes[i] instanceof Doutorado) doutorado++;
            else if(estudantes[i] instanceof Mestrado) mestrado++;
            else if(estudantes[i] instanceof Graduacao) graduacao++;
        }
        System.out.println("Graduação: " + graduacao);
        System.out.println("Mestrado: " + mestrado);
        System.out.println("Doutorado: " + doutorado);

    }
///* 
    public void listarEstudantes(){
        for(int i =0; i< contadorEstudantes; i++){
            System.out.println(estudantes[i].getNome() + "\nendereco: " + estudantes[i].getEndereco());
            //System.out.println();
            if(estudantes[i] instanceof Doutorado){
                Doutorado doutorado = (Doutorado) estudantes[i];
                System.out.println("Título da tese: " + doutorado.getTituloTese() + 
                "; Linha de Pesquisa: " + doutorado.getLinhaPesquisa());
            }
            System.out.println();
        }
    }
//*/

    public void exibirUniversidade(){
       // System.out.println("");
        System.err.println(nomeUniversidade + " " + dataFundacao);
    }
/* 
    public void listarEstudantes(){
     //   Estudante estudante = new Estudante("Carlos", "RUA TAL DE TAL");
        for(int i =0; i< contadorEstudantes; i++){
                estudantes[i].exibir();
    }
    }
*/

    public void copiarEstudantePosGraduacao(){
        
    }

}
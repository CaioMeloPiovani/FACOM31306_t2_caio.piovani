package ex04.Classe_mae;

public class Amigos extends Contato {
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau){
        super(apelido, nome, email, aniversario);
        //GRAU 1 = MELHOR AMIG || GRAU 2 = AMIG ||| GRAU  3 = CONHECIDO
        if (grau >= 1 && grau <= 3) {
            this.grau = grau;
        }else{
            this.grau = 3;
        }
    }
    

    public int getGrau(){
        return grau;
}

    public void setGrau(int grau) {
        if(grau >= 1 && grau <= 3)
        this.grau = grau;
}

    public String grauAmizade() {
        if(grau == 1){
            return "Melhor amigo"; 
        } else if (grau == 2){
            return "Amigos";
        } else
            return "Conhecidos";
}

    public void melhoresAmigos(){
        if(getGrau() == 1){
            grauAmizade();
        }
    }

    @Override
    public void imprimirContato(){
        System.out.println("Grau de Amizade: " + grauAmizade());
        System.out.println(super.imprimirBasico());
    }

}

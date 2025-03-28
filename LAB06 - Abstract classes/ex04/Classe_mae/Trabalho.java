package ex04.Classe_mae;

public class Trabalho extends Contato{
    private String cargo;

    public Trabalho(String apelido, String nome, String email, String anivertsario, String cargo){
        super(apelido, nome, email, anivertsario);
        this.cargo = cargo;
    }
    
    @Override
    public void imprimirContato(){
        System.out.println("CARGO: " + cargo);
        System.out.println(super.imprimirBasico());
    }

    public String getCargo() {
        return cargo;
    }
}

package ex04.Classe_mae;

public class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    
    }
    @Override
    public void imprimirContato() {
        System.out.println("PARENTESCO: " + parentesco);
        System.out.println(super.imprimirBasico());

    }

}

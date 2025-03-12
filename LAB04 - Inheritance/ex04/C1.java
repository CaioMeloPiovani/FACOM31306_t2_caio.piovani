public class C1 {
    public int a1;
    protected int a2;
    private int a3;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(int a1, int a2, int a3){
        this.a1 = a1;
        this.a3 = a3;
        this.a2 = a2;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    
    public void mostrar_atributos(){
        System.out.println("Valores de C1:" +
                "\nvalor 1: " + a1 + 
                "\nvalor 2:" + a2 + 
                "\nvalor 3:" + a3); 
    }

    public void mostrarAtributosSuper(){
        System.out.println("\nAtributos C1:" +
                            "\nPublico: " + a1 +
                           "\nProtegido: " + a2 +
                           "\nPrivado: " + a3);
    }

    public int getA3() {
        return a3;
    }

}

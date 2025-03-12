public class C2 extends C1{
    public int b1;
    protected int b2;
    private int b3;

    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(int a1, int a2, int a3, int b1, int b2, int b3){
        super(a1, a2, a3);
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");
    }

    public void mostrar_atributos(){
        System.out.println("\nClasse C2" +
                "\nPublico: " + b1 + 
                "\nProtegido:" + b2 + 
                "\nPrivado:" + b3 +
                "\nPublico: " + a1 +
                "\nProtegido: " + a2 +
                "\nPrivado: " + getA3());  
    }
    
    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("\nAtributos C2:" +
                           "\nPublico: " + b1 +
                           "\nProtegido: " + b2 +
                           "\nPrivado: " + b3); 
    }

    public int getB3() {
        return b3;
    }

}

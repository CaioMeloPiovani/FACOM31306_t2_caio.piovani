public class C3 extends C2{
    public int x1;
    protected int x2;
    private int x3;

    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
        this.x1 = 0; 
        this.x2 = 0;
        this.x3 = 0;
    }

    public C3(int a1, int a2, int a3, int b1, int b2, int b3, int x1, int x2, int x3){
        super(a1, a2, a3, b1, b2, b3);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    public void mostrarAtributos(){
        System.out.println("\nClasse C3" +
                "\nPublico: " + x1 + 
                "\nProtected: " + x2 + 
                "\nPrivado: " + x3 +
                "\nPublico: " + a1 + 
                "\nProtected: " + a2 + 
                "\nPrivado: " + getA3() +
                "\nPublico: " + b1 + 
                "\nProtected: " + b2 +
                "\nPrivado: " + getB3());
    }

    
    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("\nAtributos C3:" +
                            "\nPublico: " + x1 +
                            "\nProtegido: " + x2 +
               "\nPrivado: " + x3); 
    }
    
}   


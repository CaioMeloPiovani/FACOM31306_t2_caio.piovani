public class Main {
    public static void main(String[] args) {
        C3 c3 = new C3(1,2,3,4,5,6,7,8,9);
        System.out.println("Atributos de C3 ");
        c3.mostrarAtributos();
        System.out.println("Atributos de todas as classes:");
        c3.mostrarAtributosSuper();
    }
}

package ex03;

public class Main {
public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Federal de UberlAndia", "14/08/1969");

        universidade.adicionarEstudante(new Graduacao("Alice", "Rua Corinthians"));
        universidade.adicionarEstudante(new Mestrado("Bob", "Rua Timao", "Computação"));
        universidade.adicionarEstudante(new Doutorado("Charlie", "Rua Preto", "Inteligência Artificial", "Tese de IA"));
        universidade.adicionarEstudante(new Graduacao("Marcelo", "Rua Branco"));

//menuzinho
        universidade.exibirUniversidade();
        System.out.println();
        universidade.contarEstudantesPorTipo();
        System.out.println();
        universidade.listarEstudantes();
    
    }
}
    

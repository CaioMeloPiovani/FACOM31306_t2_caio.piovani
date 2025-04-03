package ex1;
import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
    
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new Funcionario("438.714.338-02", "Caio de Melo Piovani", 1000, 0);
        
        try{
            funcionarios[0].aumentoSalario(15);
            System.out.println("Salario com o aumento : " + funcionarios[0].getSalario());
        } catch (RuntimeErrorException erro){
            System.out.println("mudanca nao disponivel: " + erro.getMessage());
        }

    }
}

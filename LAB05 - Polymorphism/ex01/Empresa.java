package ex01;

import ex01.funcionario.Funcionario;
import ex01.funcionario.Chefe;
import ex01.funcionario.Vendedor;
import ex01.funcionario.Operario;
import ex01.funcionario.Horista;

public class Empresa {
    public static void main(String[] args) {

    Funcionario[] funcionarios = new Funcionario[4];

    funcionarios[0] = new Chefe("Yuri Alberto", "30/08/2004", 35000);
    funcionarios[1] = new Vendedor("Romero", "29/03/2005", 30000, 10, 100);
    funcionarios[2] = new Operario("Cristiano Ronaldo", "12/12/2012", 2000, 1);
    funcionarios[3] = new Horista("Memphis Depay", "29/03/2001", 15000, 1);

    for(Funcionario i : funcionarios){
        i.exibirSalario();
    }

    }
}


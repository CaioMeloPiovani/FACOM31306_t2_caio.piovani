package ex05;

import ex05.funcionario.Funcionario;
import ex05.funcionario.Chefe;
import ex05.funcionario.Vendedor;
import ex05.funcionario.Operario;
import ex05.funcionario.Horista;

public class Empresa {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[8];

        //chefes
        funcionarios[0] = new Chefe("Yuri Alberto", "12/12/1993", 7000);
        funcionarios[1] = new Chefe("Depay", "05/01/1991", 7500);
    
        //vendedores
        funcionarios[2] = new Vendedor("Garro", "30/02/2002" , 1500, 20, 230);
        funcionarios[3] = new Vendedor("Romero", "01/01/2001", 1300, 15, 250);

        //operario
        funcionarios[4]= new Operario("Hugo", "08/02/1920", 30, 200);
        funcionarios[5]= new Operario("Bidon", "19/10/2014", 30, 170);

        //horista
        funcionarios[6] = new Horista("Martinez", "06/09/2009", 20, 150);
        funcionarios[7] = new Horista("Raniele","15/12/2000", 25, 145);

    
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].exibirSalario();
            
        }
    
    }
}

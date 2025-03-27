package ex04;

import ex04.Classe_mae.Contato;
import ex04.Classe_mae.Familia;
import ex04.Classe_mae.Amigos;

public class FaceFriends {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[4];

        contatos[0] = new Familia("Jota", "Joao", "joaojota@gmail.com", "10/05/2000", "Primo");
        contatos[1] = new Familia("Le", "Leticia", "Leticia123@gmail.com", "10/01/1950", "Prima");
        contatos[2] = new Amigos("Craque", "Yuri Alberto", "yurialbertotimao@gmail.com", "15/03/2000", 1);
        contatos[3] = new Amigos("Holandes", "Memphis Depay", "memphisCoringao@gmail.com", "14/11/1995", 1);

        //teste imprimir
        contatos[0].imprimirContato();
        
        System.out.println("\n\n");
        //teste imprimir so um tipo.
        for(Contato contato : contatos){
            if(contato instanceof Amigos){
                contato.imprimirContato();
                System.out.println("\n");
                
            }

        }


    }
    
}

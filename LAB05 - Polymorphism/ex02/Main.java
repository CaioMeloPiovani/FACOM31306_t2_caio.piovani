package ex02;

import ex02.formaBidmensional.Circunferencia;
import ex02.formaBidmensional.Quadrado;
import ex02.formaBidmensional.Triangulo;
import ex02.formaTridimensional.Cubo;
import ex02.formaTridimensional.Esfera;
import ex02.formaTridimensional.Tetraedro;

public class Main {
    public static void main(String[] args) {
        Forma[] forma = new Forma[6];


//forma bid
        forma[0] = new Circunferencia(3);
        forma[1] = new Quadrado(4);
        forma[2] = new Triangulo(5, 3);

//forma Tridimensional

        forma[3] = new Esfera(3);
        forma[4] = new Cubo(3);
        forma[5] = new Tetraedro(4,4, 5);
        

//  
System.out.println(" ==== FORMAS BIDMENSINAIS ====\n");
        for (int i = 0; i < 3; i++) {
           forma[i].exibirDados();
        }
        System.out.println("\n");

System.out.println(" ==== FORMAS TRIDMENSINAIS ====\n");
        for(int j = 3; j < 6; j++)
            forma[j].exibirDados();

    }
}

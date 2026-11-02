
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EjercicioMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);

        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota " + i + ": ");
            double nota = teclado.nextDouble();
            suma += nota;
        }

        double media = suma / 5;

        System.out.println("La media es: " + media);

        if (media >= 5) {
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has suspendido");
        }

    }
    
}

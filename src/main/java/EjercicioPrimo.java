
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EjercicioPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        boolean primo = numero >= 2;

        for (int i = 2; i <= numero / i && primo; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }
    
}

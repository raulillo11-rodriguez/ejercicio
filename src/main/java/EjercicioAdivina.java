
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EjercicioAdivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int secreto = aleatorio.nextInt(50) + 1;
        int intento = 0;
        int intentos = 0;

        while (intento != secreto) {
            System.out.print("Adivina el numero (1-50): ");
            intento = teclado.nextInt();
            intentos++;

            if (intento < secreto) {
                System.out.println("El numero secreto es mayor");
            } else if (intento > secreto) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("¡Correcto!");
                System.out.println("Intentos realizados: " + intentos);
            }
        }

    }
    
}

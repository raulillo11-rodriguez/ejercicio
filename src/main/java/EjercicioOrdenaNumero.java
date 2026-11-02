
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EjercicioOrdenaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Numeros ordenados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
}

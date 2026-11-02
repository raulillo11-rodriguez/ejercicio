
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EjercicioVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        int vocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if ("aeiouáéíóú".indexOf(letra) != -1) {
                vocales++;
            }
        }

        System.out.println("La frase tiene " + vocales + " vocales");
    }
    
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ejerciciosif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio Practico
         /*Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Introduce edad");
         edad = teclado.nextInt();
         if(edad<12){
             System.out.println("Niño");
        }else if(edad<=17){
             System.out.println("Adolescente");
        }else{
             System.out.println("Jublidado");
       
            
        }*/
        // TODO code application logic here
        //Ejercicio Practico
        /*int[] numeros = {4, 12, 7, 15, 20, 3};
        int cont=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>10){
                cont++;
            }
        }
        System.out.println(cont);*/
        
        //Ejercicio Practico
       /* int[] numeros = {2, 7, 4, 9, 6, 3};
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2!=0){
                System.out.println(numeros[i]+" Impares");
                suma=suma+numeros[i];
            }else{
                System.out.println(numeros[i]+" Pares");
            }
        }
        System.out.println(suma);*/
       
       //Ejercicio Practico
       /*int[] numeros = {-5, 3, -2, 8, -7, 4};
       int cont=0;
       int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]<0){
                suma=suma+numeros[i];
                cont++;
            }else{
                
            }
            
        }
        System.out.println("Los numeros megativos" +cont);
            System.out.println("Suma"+suma);*/
       
       //Ejercicio Practico
       /*int[] numeros = {-3, 5, 0, 8, -2, 4, -7};
       int cont=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>0){
                cont++;
            }
            
        }
        System.out.println("Cantidad postivos:"+cont);*/
       
       //Ejercicio Practico
       /*int[] numeros = {3, 8, 5, 2, 7, 10, 1};
       int contP=0;
       int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contP++;
            }else{
                suma=suma+numeros[i];
            }
            
        }
        System.out.println("Cantidad de pares:"+contP);
        System.out.println("Suma de impares:"+suma);*/
       
       //Ejercicio Practico
        /*int[] numeros = {-2, 0, 5, -7, 3, 0, 9, -1};
         int contN=0;
         int contP=0;
         int contC=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]<0){
                contN++;
            }else if(numeros[i]>0){
                contP++;
            }else{
                contC++;
            }
            
        }
        System.out.println("Negativo:"+contN);
        System.out.println("Positivo:"+contP);
        System.out.println("Ceros:"+contC);*/
        
        //Ejercicio Practico
        int[] numeros = {-4, 6, 8, -2, 10, 4};
        int suma=0;
        double media=0.0;
        int contP=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>0){
                suma=suma+numeros[i];
                contP++;
                media=suma/contP;
            }else{
                System.out.println("Son negativos");
            }
            
        }
        System.out.println("Cantidad Positivos:"+contP);
        System.out.println("Suma de postivos:"+suma);
        System.out.println("La media es:"+media);
    }
    
}

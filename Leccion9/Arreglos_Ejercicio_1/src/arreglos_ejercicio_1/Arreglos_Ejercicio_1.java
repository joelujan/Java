/*
Ejercicio 1 : Leer  5 numeros, guardarlos en un arreglo y mostrarlos 
en el orden introducidos.
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Arreglos_Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[] arreglo = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = leer.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        //Mostramos los numeros
        for (float f : arreglo) {
            System.out.println(f+" ");
        }
        System.out.println("\n");
        
    }

}

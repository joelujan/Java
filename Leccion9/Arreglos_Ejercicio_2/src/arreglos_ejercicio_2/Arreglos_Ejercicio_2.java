/*
Ejercicio 1 : Leer  5 numeros, guardarlos en un numeros y mostrarlos 
en el orden inverso.
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Arreglos_Ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = leer.nextFloat();
        }
        for(int i = 4; i >= 0; i--) {
            System.out.print(i+ " " + numeros[i]);
        }
        System.out.println("\n");
    }
}

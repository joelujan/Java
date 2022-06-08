/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        System.out.println("Ingrese la nota 1 del estudiante");
        nota1 = Float.parseFloat(leer.nextLine());
        System.out.println("Ingrese la nota 2 del estudiante");
        nota2 = Float.parseFloat(leer.nextLine());
        System.out.println("Ingrese la nota 3 del estudiante");
        nota3 = Float.parseFloat(leer.nextLine());
        suma = nota1 + nota2 + nota3;
        System.out.println("El resultado de la suma es: "+suma);
    }
    
}

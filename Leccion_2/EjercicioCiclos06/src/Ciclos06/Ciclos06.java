/*
 Ejercicio 06: Pedir numeros hasta q se teclee un 0, mostrar la suma de todos
los numeros introducidos
 */
package Ciclos06;

import java.util.Scanner;


public class Ciclos06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,suma = 0;
        do{
            System.out.println("Ingrese un numero");
            num = Integer.parseInt(leer.nextLine());
            suma += num;//los mismo q hacer suma = suma + num
        }while(num != 0);
        System.out.println("\nLa suma de los numeros ingresados es: "+suma);
    }
}

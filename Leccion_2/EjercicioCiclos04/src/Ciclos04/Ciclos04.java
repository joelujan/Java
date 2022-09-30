/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner.
Luego lo hacemos con la clase JOptionPane
 */
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        var num = Integer.parseInt(leer.nextLine());
        int conteo=0;
        while (num >= 0){
            System.out.println("El numero es positivo");
            conteo++; // o conteo +=1;
            System.out.println("Ingrese otro numero");
            num = Integer.parseInt(leer.nextLine());
        }
        System.out.println("La cantidad de numeros positivos ingresados es de: "+conteo);
        
        
    }
}

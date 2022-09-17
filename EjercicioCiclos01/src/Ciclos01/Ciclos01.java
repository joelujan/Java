/*
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo
*/
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        int numero,cuadrado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para poder mostrar su cuadrado");
        numero = Integer.parseInt(leer.nextLine());
        while(numero >= 0){//Mientras el numero sea igual a cero o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(leer.nextLine());
        }
        System.out.println("El programa a finalizado por numero negativo");
    }
    
    
}

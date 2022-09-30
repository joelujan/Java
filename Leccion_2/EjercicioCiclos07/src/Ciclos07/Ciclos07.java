/*
EJercicio 7 : Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(leer.nextLine());
        while (numero >= 0) {
            conteo++;
            suma += numero;
            System.out.println("Digite un numero");
            numero = Integer.parseInt(leer.nextLine());
        }
        if(conteo == 0){
            System.out.println("\nError, la division entre 0 no existe");
        }else{
        promedio = (float)suma / conteo;
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
        }
    }
}

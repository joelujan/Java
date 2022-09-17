/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo. EL proceso se repetira hasta
que se introduzca un cero 0
*/
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var num = Integer.parseInt(leer.nextLine());
        while (num!=0){
            if(num>0){
                System.out.println("El numero: "+num+" es positivo");
            }
            else{
                System.out.println("El numero: "+num+" es negativo");
            }
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(leer.nextLine());
        }
        System.out.println("El numero: "+num+" finaliza el programa");
            
        
    }
}

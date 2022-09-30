/*
Ejercicio 5 : Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y luego
ir pidiendo numeros indicando "es mayor" o "es menor" segun sea
mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el numero
de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, aleatorio, conteo =0;
        aleatorio = (int)(Math.random()*100);//esto genera un numero aleatorio del 0 al 100
        do{
            System.out.println("Digite un numero");
            num = Integer.parseInt(leer.nextLine());
            if(num < aleatorio){
                System.out.println("Digite un numero mayor");
            }
            else if(num > aleatorio){
                System.out.println("Digite un numero menor");
            }else{
                System.out.println("Felicitaciones, acertaste el numero aleatorio.");
            }
            conteo ++;
                
        }while(num != aleatorio);
        System.out.println("\tAdivinaste el numero: "+num+" en el intento: "+conteo);
    }
}

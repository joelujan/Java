/*
Ejercicio 3: Leer numeros hasta q se introduzca un cero. Para cada uno indicar
si es par o impar. Primero lo haremos con la clase Scanner. Luego con la clase 
JOptionPane
 */
package Ciclos03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos03 {
    public static void main(String[] args) {
                   //Do While con Scanner
    /*    Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero diferente a 0");
            num = Integer.parseInt(leer.nextLine());
            if (num%2==0){
            System.out.println("El número es par");
            } else {
                System.out.println("El numero es impar");
            }
        } while (num != 0);
    */
            
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    while(num!=0){
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "El número: "+num+" , es par");
        }else{
            JOptionPane.showMessageDialog(null, "El número: "+num+" , es impar");
        }
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    } 
    

}

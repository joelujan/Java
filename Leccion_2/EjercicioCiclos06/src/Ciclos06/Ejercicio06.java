/*
 Ejercicio 06: Pedir numeros hasta q se teclee un 0, mostrar la suma de todos
los numeros introducidos
 */
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {

    public static void main(String[] args) {
        int num, suma = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para sumar"));
            suma += num;//los mismo q hacer suma = suma + num
        } while (num != 0);
        JOptionPane.showMessageDialog(null, "\nLa suma de los numeros ingresados es: " + suma);
    }
}

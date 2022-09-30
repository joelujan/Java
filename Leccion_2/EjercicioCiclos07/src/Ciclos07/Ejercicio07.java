/*
EJercicio 7 : Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {

    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero >= 0) {
            conteo++;
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }
        if (conteo == 0) {
            JOptionPane.showMessageDialog(null, "Error, la division entre 0 no existe");
        } else {
            promedio = (float) suma / conteo;
            JOptionPane.showMessageDialog(null,"El promedio de los numeros ingresados es: " + promedio );
        }
    }
}

/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Luego lo hacemos con la clase JOptionPane
 */
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int conteo = 0;
        while (num >= 0) {
            JOptionPane.showMessageDialog(null,"El numero ingresado es positivo" );
            conteo++; // o conteo +=1;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }

        JOptionPane.showMessageDialog(null,"La cantidad de numeros positivos ingresados fue de :"+conteo );

    }

}

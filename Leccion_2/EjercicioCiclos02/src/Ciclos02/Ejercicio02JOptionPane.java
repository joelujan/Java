/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo. EL proceso se repetira hasta
que se introduzca un cero 0
*/
package Ciclos02;

import javax.swing.JOptionPane;

public class Ejercicio02JOptionPane {
        public static void main(String[] args) {
        
        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (num!=0){
            if(num>0){
                JOptionPane.showMessageDialog(null,"El numero: "+num+" es positivo" );
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero: "+num+" es negativo");
            }
            
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        
        }
        JOptionPane.showMessageDialog(null, "El numero: "+num+" finaliza el programa");
               
    }
}

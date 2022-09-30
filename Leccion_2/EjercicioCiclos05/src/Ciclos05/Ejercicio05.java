/*
Ejercicio 5 : Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y luego
ir pidiendo numeros indicando "es mayor" o "es menor" segun sea
mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el numero
de intentos hechos.
 */
package Ciclos05;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int num, aleatorio, conteo =0;
        aleatorio = (int)(Math.random()*100);//esto genera un numero aleatorio del 0 al 100
        do{
            ;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(num < aleatorio){
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor");
            }
            else if(num > aleatorio){
                JOptionPane.showMessageDialog(null, "Ingrese un numero menor");
            }else{
                JOptionPane.showMessageDialog(null, "Felicitaciones, acertaste el numero aleatorio");
            }
            conteo ++;
                
        }while(num != aleatorio);
        JOptionPane.showMessageDialog(null,"Adivinaste el numero: "+num+" en el intento: "+conteo);
    }
    
        
}

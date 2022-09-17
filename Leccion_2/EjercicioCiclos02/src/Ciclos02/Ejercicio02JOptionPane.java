/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos02;

import javax.swing.JOptionPane;


/**
 *
 * @author Joel
 */
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

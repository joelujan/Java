/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int salarioRegular = 1000;
        Scanner leer = new Scanner(System.in);
        int comision, carrosVendidos, valorTotal;
        float porcentajeDeValor, salarioFinal;
        System.out.println("Buenos dias, ingrese por favor la cantidad de autos vendidos por el vendedor este mes");
        carrosVendidos = Integer.parseInt(leer.nextLine());
        System.out.println("Por favor ingrese la suma de todos los valores de lo vehiculos vendidos");
        valorTotal = Integer.parseInt(leer.nextLine());
        comision = 150 * carrosVendidos;
        porcentajeDeValor = (5 * valorTotal)/100;
        salarioFinal = salarioRegular + comision + porcentajeDeValor ;
        System.out.println("El vendedor deberá cobrar: $"+salarioFinal);
        System.out.println("Realizó "+carrosVendidos+" ventas de vehiculos.");
        System.out.println("Su comisión es de: $"+comision);
        System.out.println("Y su porcentaje de ventas por valor es de: $"+porcentajeDeValor);
    }
    
}

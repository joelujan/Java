/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int guillermo, luis, juan, suma;
        System.out.println("Ingrese la cantidad de dinero de Guillermo");
        guillermo = Integer.parseInt(leer.nextLine());
        luis = guillermo / 2;
        juan = (luis + guillermo)/ 2;
        suma = guillermo + luis + juan;
        System.out.println("La suma de dinero entre los tres es de: US$"+suma+", Guillermo tiene: US$"+guillermo+", Juan tiene: US$"+juan+", y Luis tiene: US$"+luis);
    }
    
}

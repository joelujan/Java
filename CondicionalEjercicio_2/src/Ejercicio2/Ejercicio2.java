package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero del mes: ");
        var mes = Integer.parseInt(leer.nextLine());
        var estacion = "Estacion desconocida";
        switch(mes){
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otonio";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
                       
        }
        System.out.println("estacion = " + estacion);
    }
  
}

package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {            //psvm + tab
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantidad de horas trabajadas");
        var horas = leer.nextDouble();
        System.out.println("Ingrese el costo por hora");
        var precioPorHora = leer.nextDouble();
        var sueldo = horas * precioPorHora;
        System.out.println("El salario de un empleado que trabajo " + horas + ", y cobra " + precioPorHora + " pesos. Es de: " + sueldo + " pesos.");
        
        /*
        int horasSemanales;
        float salarioHora, salarioTotal;
        System.out.println("Digite las horas semanales trabajadas: ");
        horasSemanales = Integer.parseInt(leer.nextLine());
        System.out.println("Digite el salario que cobra por hora");
        salarioHora = Float.parseFloat(leer.nextLine());
        
        salarioTotal = horasSemanales * salarioHora;
        */
    }
}

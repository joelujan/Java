package caja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el ancho en centimetros: ");
        int ancho = Integer.parseInt(leer.nextLine());
        System.out.println("Por favor ingrese el alto en centimetros: ");
        int alto = Integer.parseInt(leer.nextLine());
        System.out.println("Por favor ingrese la profundidad en centimetros: ");
        int profundidad = Integer.parseInt(leer.nextLine());
        
        Caja caja1 = new Caja();
        //caja1.ancho = ancho;
        //caja1.alto = alto;
        //caja1.profundidad = profundidad;
        
        
        int resultado = caja1.calcularVolumen(ancho, alto, profundidad);
        System.out.println("Resultado volumen de caja 1: "+resultado);
        
        Caja caja2 = new Caja(); // Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("Resultado volumen de caja 2: "+caja2.calcularVolumen(2, 4, 6));
    }
}

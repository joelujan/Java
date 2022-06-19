package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero entre 0 y 10: ");
        var calificacion = Integer.parseInt(leer.nextLine());
//        if(calificacion >=9 && calificacion <=10){
//            System.out.println("A");
//        }
//        else if (calificacion >=8 && calificacion <=9){
//            System.out.println("B");
//        }
//        else if (calificacion >=7 && calificacion <=8){
//            System.out.println("C");
//        }
//        else if (calificacion >=6 && calificacion <=7){
//            System.out.println("D");
//        }
//        else if (calificacion >=0 && calificacion <=6){
//            System.out.println("F");
//        }
//        else {
//            System.out.println("Fuera de Rango");
//        }
        switch (calificacion) {
            case 10: case 9: 
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5,4,3,2,1:
                System.out.println("F");
                break;
        }
    }

}

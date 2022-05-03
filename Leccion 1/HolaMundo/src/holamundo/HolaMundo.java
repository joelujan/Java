/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);

//        System.out.println("Hola Mundo desde Java");
//        int myVariable = 25;
////        String palabra = "/t hola";
//        System.out.println(myVariable);
//        myVariable = 30;
//        System.out.println(myVariable);
//        //tipo String
//        String miVariableCadena = "Bienvenidos";
//        System.out.println(miVariableCadena);
//        miVariableCadena = "Sigamos creciendo en programación";
//        System.out.println(miVariableCadena);
//Var - inferencia de tipos en Java
//        var miVariableEntera = 10;
//        var miVariableCadena2 = "Seguimos estudiando";
//        System.out.println("miVariableEntera = " + miVariableEntera);
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Reglas para definir una variable en Java
//        var usuario = "Osvaldo";
//        var titulo = "Ingeniero";
//        var union = titulo + " " + usuario;
//        System.out.println("union = " + union);
//        System.out.println("Digite primero la hora");
//        var a = 8;
//        var b = 4;
//        System.out.println(usuario + (a + b)); //agregando los parentesis le damos prioridad a la suma, sino, nos tomaba todo como cadena
//
//        //Caracteres especiles en Java
//        var nombre = "Natalia";
//        System.out.println("Nueva linea: \n " + nombre); //Diagonal inversa y n (salto de linea)
//        System.out.println("Tabulador: \t" + nombre); // Diagonal inversa y t (tabulador)
//        System.out.println("\t.:Menú:.");
//        System.out.println("Retroceso: \b\b" + nombre);//Caracter de Retroceso
//        System.out.println("Comillas simples: \'"+nombre+"\'"); //Comillas simples
//        System.out.println("Comillas dobles: \""+ nombre + "\""); //Comillas dobles
//        
        //Clase Scanner
//        Scanner leer = new Scanner(System.in).useDelimiter("/n");
//        System.out.println("Digite su nombre: ");
//        var usuario2 = leer.nextLine();
//        System.out.println("usuario2 = " + usuario2);
//        System.out.println("Escriba el titulo: ");
//        var titulo2 = leer.nextLine();
//        System.out.println("Resultado: "+titulo2+" "+usuario2);
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        System.out.println("Proporciona el titulo: ");
        String titulo = leer.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = leer.nextLine();
        System.out.println(titulo + " fue escrito por "+autor);

//        int hora = leer.nextInt();
//        System.out.println("Digite los minutos");
//        int minutos = leer.nextInt();
//        System.out.println("Digite los segundos");
//        int segundos = leer.nextInt();
//        int resultado = (hora * 3600) + (minutos * 60) + segundos;
//        System.out.println("La cantidad de segundos es:" + resultado);
//        System.out.println("Ingrese el radio de la circunferencia");
//        Double radio = leer.nextDouble();
//        Double area = Math.PI * Math.pow(radio, 2);
//        System.out.println(area);
    }

}

package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 su nombre es:" + persona1.getNombre());
        //Modificar a través de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // YA no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre);//ERROR
        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        //Tarea crear otro objeto de tipo Persona, asignar valores de manera inicial
        // y imprimir, luego modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Ariel", 26000, false);
        System.out.println("persona1 su nombre es:" + persona2.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: " + persona2.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona2.isEliminado());

        persona2.setNombre("Dante Alighieri");
        persona2.setSueldo(100000);
        System.out.println("persona1 su nombre es:" + persona2.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: " + persona2.getSueldo());
    }
}

package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel", 57000.0);//LLamo al constructor vacío de la clase padre de empleado, O sea clase persona
        System.out.println("empleado1 = " + empleado1);
        
        int contador = Integer.parseInt(empleado1.getDireccion());
        System.out.println("contador");
        
//        Date fecha1 = new Date();

//        Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413");
//        System.out.println("cliente1 = " + cliente1);
        
//        Persona persona1 = new Persona();
    }
    
}

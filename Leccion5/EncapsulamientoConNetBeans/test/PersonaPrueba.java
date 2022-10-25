
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1"+persona1);
        //Modificar a traves de los metodos
        persona1.setNombre("Juan ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre);//esto ya no se usa
        System.out.println("Persona1 su  nombre modificado es : "+persona1.getNombre());
        System.out.println("Persona1 el resultado para el sueldo es: "+persona1.getSueldo());
        System.out.println("Persona1 para obtener el booleano: "+persona1.isEliminado());
            
        //System.out.println("persona1: "+persona1.toString());
        System.out.println("persona1: "+persona1);//Aca llama directamente al toString cuando esta definido en la clase
        
    }
}

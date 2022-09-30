package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();//LLamamos al constructor vacio q viene por defecto.
        persona1.nombre = "Ariel";//El valor hexadecimal normalmente comienza con 0x.
        persona1.apellido = "Betancud";
        persona1.obtenerInformación();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);//Para ver el lugar donde esta asignado este espacio de memoria
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformación();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformación();
    }   
}

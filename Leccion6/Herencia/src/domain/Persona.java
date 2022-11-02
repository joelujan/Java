
package domain;

public class Persona {
    //Atributos de herencia, cuando hacemos los getter, setter y el toString se cambian a private.
    //Protected es para poder acceder en lo q es la herencia a los atributos de la clase padre
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio: este es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona() {
    }
    //Constructor 2 - Cada constructor q creamos es para crear objetos de dist manera
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //Constructor 3 
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        //sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}
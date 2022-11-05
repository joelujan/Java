
package domain;

//Esto es una clase constante, no se puede extender de esta, 
//evita que se puedan tener clases hijas
//public final class Persona
public class Persona {
    
    public final static int CONSTANTE_AQUI = 15;//Sintaxis de un atributo constante
    //una variable marcada como final se combina con static, no se puede modificar y se define en mayuscula
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir(){
        System.out.println("Método para imprimir");
    }
}

/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde
se aplique:
        variables: Evita cambiar el valor que almacena la variable
        métodos: Evita que se modifica la definicion o el comportamiento
        de un metodo desde una sublclase(hija)
        clases: Evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajemos con variables
se combina con el modificador de acceso estatico para convertir una variable en una constante, 
es decir que no se puede modificar su valor, el ejemplo de esto es la clase Math en la cual
todos sus atributos son de tipo static y finbal, es por esto que la variable pi* se conoce como una c
constante
 */
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 39555128;
        System.out.println("miDni = " + miDni);
        //miDni = 20312321;
        //Persona.CONSTANTE_AQUI = 9;//No se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();//Si le queremos asignar a esta variable, una referencia de un nuevo objeto, no se puede hacer
        //persona1 = new Persona();//No se puede xq persona1 tiene valor final
        persona1.setNombre("Ariel Betancud");//No se puede modificar la referencia pero si el contenido del objeto
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Liliana");//Tambien te permite modificar el objeto
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}

/*
Proyecto caja:
Ejercicio 1: Crear un proyecto según las especificaciones
mostradas a continuación.
La fórmula es: volumen = ancho * alto * profundidad
 */
package caja;

public class Caja {

    public int ancho;
    public int alto;
    public int profundidad;

    public Caja() {
        System.out.println("Se esta ejecutando el constructor numero uno");
    }

    public Caja(int ancho, int alto, int profundidad) {
        System.out.println("Se esta ejecutando el constructor numero uno");
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public int calcularVolumen(int ancho, int alto, int profundidad) {
        return ancho * alto * profundidad;
    }
}
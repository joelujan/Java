
package domain;


public class Empleado extends Persona{
    //Los constructores y los atributos, ambos se heredan. 
    //Igual podemos acceder con la palabra super, lo define el paso de argumentos
    //Private va a tener este.
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;//El static es para q este asociado a la clase, una especie de contador
    
    //Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);//Asi seteo el nombre solo de su clase padre
        this.idEmpleado = ++Empleado.contadorEmpleados;//Dentro del contexto estático asi debo llamar
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    //Quitamos el set del idEmpleado xq no necesitamos que sea modificado de ninguna manera, ya q es llamado del
    //constructor.
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {//Con el string builder es mas eficiente la concatenacion de cadenas
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());//para llamar a la clase padre lo llamo con super
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

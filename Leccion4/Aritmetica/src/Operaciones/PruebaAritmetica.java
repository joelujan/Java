
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;//Variables locales
        int b = 7;  //Stack son las variables locales
        miMetodo(); //Llamamos al metodo nuevo, el alcance de los metodos es superior a los atributos
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;

        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memoria Heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos  = " + resultado);
        
        System.out.println("aritmetical a:"+aritmetica1.a);
        System.out.println("aritmetical b:"+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
      //aritmetica1 = null; Esto no es necesario, no es necesario limpiar, xq se hace con el garbage collector de java
      //System.gc();//Metodo para limpiar residuos, es pesado, no utilizar
      Persona persona = new Persona("Ariel", "Betancud");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona nombre: "+persona.apellido);
      
    }
    
    //Modularidad
    public static void miMetodo(){
        //a= 10; una varialbe esta limitada
        System.out.println("Aqui hay otro metodo");
        
    }
}
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        super();//LLamada al constructor de la clase Padre Object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this"+this);
    }
}
class Imprimir{
    public Imprimir(){
        super();//El constructor de la clase padre para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir "+persona);
        System.out.println("Impresión del objeto actual (this): "+this);
    }
}
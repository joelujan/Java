
package Operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Aritmetica(){ //Constructor 1
        System.out.println("Se esta ejecutando el constructor numero uno");
    }
    //Sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor numero 2");
    }
    
    //Métodos
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        return a + b;
    }
    /*
    This: es una variable u operador, que apunta al objeto en ejecucion,
    al objeto, al espacio de memoria donde esta para hacer modificaciones
    
    */
    public int sumarConArgumentos(int arg1, int arg2){//Argumento, la informacion que va a recibir el método
        this.a = arg1; //El argumento a, se asigna al atributo this.a
        this.b = arg2;
    /*
    El uso de this es opcional, hace que sea mas legible. El operador this,
        hace que se diferencien los atributos de los argumentos
        this.a = a;
        this.b = b;
    */    
      //return a + b;        
        return sumarConRetorno(); //LLamando a un metodo que esta en la misma clase
    }

  
}

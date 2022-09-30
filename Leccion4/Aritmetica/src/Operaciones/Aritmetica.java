
package Operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
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
        this.a = arg1;
        this.b = arg2;
        
      //return a + b;        
        return sumarConRetorno(); //LLamando a un metodo que esta en la misma clase
    }

    
}

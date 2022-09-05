package CicloWhile;


public class ejercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0;//inferencia de tipos
        //Ciclo WHILE(manejan un numero indeterminado de iteraciones)
        //Primero se ve la condicion y si tiene q repetir lo hace mediante la condicion. Puede no ejecutarse nunca
        while (conteo<= 7){
            System.out.println("conteo = " + conteo);
            conteo ++;//vamos aumentando en 1 la variable
        }
        var contador = 0;
        //Ciclo Do WHILE(manejan un numero indeterminado de iteraciones)
        //Se ejecuta por lo menos una vez lo que esta dentro del while
        do{
            System.out.println("contador = " + contador);
            contador ++;
        }while(contador <= 7);
        //Ciclo For
        for (var contando = 0; contando < 7; contando++) {
            System.out.println("contando = " + contando);
        }
    }
}

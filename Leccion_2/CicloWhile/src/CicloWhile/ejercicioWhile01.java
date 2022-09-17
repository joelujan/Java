package CicloWhile;

import java.util.Scanner;

public class ejercicioWhile01 {

    public static void main(String[] args) {
        var conteo = 0;//inferencia de tipos
        //Ciclo WHILE(manejan un numero indeterminado de iteraciones)
        //Primero se ve la condicion y si tiene q repetir lo hace mediante la condicion. Puede no ejecutarse nunca
        while (conteo <= 7) {
            System.out.println("conteo = " + conteo);
            conteo++;//vamos aumentando en 1 la variable
        }
        var contador = 0;
        //Ciclo Do WHILE(manejan un numero indeterminado de iteraciones)
        //Se ejecuta por lo menos una vez lo que esta dentro del while
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
        //Ciclo For
        //break
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break;//rompe la estructura condicional, corta la iteracion cuando encuentra el primer par
            }
        }
        //continue
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue;//Vamos a la siguiente iteracion, no hace nada y sigue
            }
            System.out.println("contando = " + contando);//va a printear los pares
        }
        //Etiquetas, Labels,
        //Uso de las palabras break y continue junto a las etiquetas(labels) siempre se inicia la etiqueta arriba de la iteracion
        //inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break ;// inicio
            }
        }
        //continue
        inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue inicio;//dice continue y vuelve al inicio
            }
            System.out.println("contando = " + contando);//va a printear los pares
        }
    }
    }       
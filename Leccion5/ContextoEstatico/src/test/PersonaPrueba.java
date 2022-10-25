package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10;//La palabra this no puede ser referencia en un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){//pasa a forma dinámica y de esta manera podemos entrar al contexto estático
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}

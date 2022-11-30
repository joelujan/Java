
package test;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5; //Llenado manual
        edades[0][1] = 7; //Llenado manual
        edades[1][0] = 8; //Llenado manual
        edades[1][1] = 4; //Llenado manual
        edades[2][0] = 6; //Llenado manual
        edades[2][1] = 2; //Llenado manual
        
        System.out.println("edades 0-0 = " + edades[0][0] );
        System.out.println("edades 0-1 = " + edades[0][1] );
        System.out.println("edades 1-0 = " + edades[1][0] );
        System.out.println("edades 1-1 = " + edades[1][1] );
        System.out.println("edades 2-0 = " + edades[2][0] );
        System.out.println("edades 2-1 = " + edades[2][1] );
        
        System.out.println("Recorremos la matriz a través del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {//ciclo externo filas
            for (int columna = 0; columna < edades[fila].length; columna++) {//ciclo interno columnas
                System.out.println("edades "+fila+"-"+columna+": "+edades[fila][columna]);
            }   
        }
        
        //Sintaxis CLASICA
        //Izq definimos la variable, lado derecho instanciamos, xq las matricas son del tipo object
        //String frutas[][] = new String[3][2];
        
        //Sintaxis Simplificada
        String frutas[][]= {{"Limon", "Pomelo"},{"Ciruela", "Kiwi"},{"Banana", "Manzana"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas"+i+"-"+j+": "+frutas[i][j]);
            }
        }
    }
}

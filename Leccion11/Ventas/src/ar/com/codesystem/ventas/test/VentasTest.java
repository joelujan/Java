
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Camisa", 11500.00);
        Producto producto4 = new Producto("Buzo", 22000.00);
        Producto producto5 = new Producto("Bufanda", 5000.00);
        Producto producto6 = new Producto("Medias", 1000.00);
        Producto producto7 = new Producto("Calzoncillos", 2000.00);
        Producto producto8 = new Producto("Zapatillas", 25000.00);
        Producto producto9 = new Producto("Zapatos", 20000.00);
        Producto producto10 = new Producto("Remera", 7000.00);
        
        Orden orden1 = new Orden();
        //Agregamos productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        //Tarea:
        //Crear mas objetos de tipo Producto
        //Crear mas objetos de tipo Orden
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();
        
        
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
    }
}

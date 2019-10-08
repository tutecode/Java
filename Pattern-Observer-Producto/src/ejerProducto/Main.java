package ejerProducto;

/*
 * Supongamos que tenemos una clase Producto con un precio y 
 * queremos emitir un mensaje en la terminal cuando un producto cambie de precio. 
 * Para implementar este patrón Producto debería extender de Observable y 
 * otra clase hacer que implemente la interfaz Observer, sin embargo, 
 * si no queremos o no podemos hacer que nuestra clase extienda de Observable 
 * para no limitarnos en nuestra jerarquía de clases o porque ya extiende de otra podemos usar composición, 
 * por otro lado, si no queremos registrar el observador en cada instancia de Producto sino 
 * observar cualquier instancia que se cree podemos implementar el Observer de forma estática en la clase Producto. 
 * El observable ProductoObservable amplia la visibilidad del método setChanged para poder hacer uso de él usando composición, 
 * deberemos invocarlo para que los observadores sean notificados. 
 * A continuación pondré el código usando composición e implementándolo de forma estática.
 */

import java.math.BigDecimal;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Libro", new BigDecimal("3.99"));
        Producto p2 = new Producto("Lector libros electrónico", new BigDecimal("129"));

        Observer o1 = new ProductoObserver();
        Producto.getObservable().addObserver(o1);

        p1.setPrecio(new BigDecimal("4.99"));
        p2.setPrecio(new BigDecimal("119"));
    }
}
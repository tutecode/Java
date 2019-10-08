package ejerProducto;

/*
 * Supongamos que tenemos una clase Producto con un precio y 
 * queremos emitir un mensaje en la terminal cuando un producto cambie de precio. 
 * Para implementar este patr�n Producto deber�a extender de Observable y 
 * otra clase hacer que implemente la interfaz Observer, sin embargo, 
 * si no queremos o no podemos hacer que nuestra clase extienda de Observable 
 * para no limitarnos en nuestra jerarqu�a de clases o porque ya extiende de otra podemos usar composici�n, 
 * por otro lado, si no queremos registrar el observador en cada instancia de Producto sino 
 * observar cualquier instancia que se cree podemos implementar el Observer de forma est�tica en la clase Producto. 
 * El observable ProductoObservable amplia la visibilidad del m�todo setChanged para poder hacer uso de �l usando composici�n, 
 * deberemos invocarlo para que los observadores sean notificados. 
 * A continuaci�n pondr� el c�digo usando composici�n e implement�ndolo de forma est�tica.
 */

import java.math.BigDecimal;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Libro", new BigDecimal("3.99"));
        Producto p2 = new Producto("Lector libros electr�nico", new BigDecimal("129"));

        Observer o1 = new ProductoObserver();
        Producto.getObservable().addObserver(o1);

        p1.setPrecio(new BigDecimal("4.99"));
        p2.setPrecio(new BigDecimal("119"));
    }
}
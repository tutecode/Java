package ejerProducto;

import java.util.Observable;
import java.util.Observer;

import ejerProducto.Producto.PrecioEvent;

public class ProductoObserver implements Observer {

    @Override
    public void update(Observable observable, Object args) {
        if (args instanceof PrecioEvent) {
            PrecioEvent evento = (PrecioEvent) args;
            System.out.printf("El producto %s ha cambiado de precio de %s a %s%n", evento.getProducto().getNombre(), evento.getPrecioAntiguo(), evento.getPrecioNuevo());
        }
    }
}
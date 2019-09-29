package ejerImpresora;

/*
En un sistema en funcionamiento tenemos una clase Impresora capaz de gestionar una
impresora real. Entre las características de esta clase, disponemos de trabajosEnCola,
encendida e imprimiendo, además de un método update encargado de actualizar la
información contenida en el objeto con la situación real del aparato.
Sabiendo que el método update es el único capaz de cambiar el estado de la impresora,
elaborar una clase SistemaDeInformación capaz de informar el estado de las
impresoras conectadas en el Sistema.
Además de la funcionalidad antes mencionada, se desea simular la impresión
documentos. Para ello se tiene la interface Documento la cual se define de la siguiente
manera:

public interface Documento {
	public void imprimite();
}

Es decir que los documentos que implementan dicha interface deberán implementar el
método imprimite, el cual imprime por consola con contenido del mismo. Por otro lado,
la cola de trabajosEnCola ahora deberá ser del tipo Documento.
El sistema además deberá contar con los siguientes métodos:
	public void imprimirTodo()
	// el cual imprime todos los documentos de la cola
	public void imprimir(Documento documento)
	 // el cual imprime el documento que se pasa por parámetro.
 */

public class Main {

	public static void main(String[] args) {
        SistemaDeInformacion si = new SistemaDeInformacion();

        Impresora i1 = new Impresora("Uno", true);
        i1.addObserver(si);

        Impresora i2 = new Impresora("Dos", false);
        i2.addObserver(si);

        i1.setImprimiendo(true);
        i2.setEncendida(true);
	}
}

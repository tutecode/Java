package ejerImpresora;

/*
En un sistema en funcionamiento tenemos una clase Impresora capaz de gestionar una
impresora real. Entre las caracter�sticas de esta clase, disponemos de trabajosEnCola,
encendida e imprimiendo, adem�s de un m�todo update encargado de actualizar la
informaci�n contenida en el objeto con la situaci�n real del aparato.
Sabiendo que el m�todo update es el �nico capaz de cambiar el estado de la impresora,
elaborar una clase SistemaDeInformaci�n capaz de informar el estado de las
impresoras conectadas en el Sistema.
Adem�s de la funcionalidad antes mencionada, se desea simular la impresi�n
documentos. Para ello se tiene la interface Documento la cual se define de la siguiente
manera:

public interface Documento {
	public void imprimite();
}

Es decir que los documentos que implementan dicha interface deber�n implementar el
m�todo imprimite, el cual imprime por consola con contenido del mismo. Por otro lado,
la cola de trabajosEnCola ahora deber� ser del tipo Documento.
El sistema adem�s deber� contar con los siguientes m�todos:
	public void imprimirTodo()
	// el cual imprime todos los documentos de la cola
	public void imprimir(Documento documento)
	 // el cual imprime el documento que se pasa por par�metro.
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

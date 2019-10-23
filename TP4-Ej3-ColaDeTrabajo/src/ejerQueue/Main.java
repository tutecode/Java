package ejerQueue;


/*
Cree la clase ColaDeTrabajo que permita encolar diversos trabajos. 
O sea, los trabajos a encolar deben implementar la interfaz Trabajo.
Defina en la clase ColaDeTrabajo un m�todo sacar() que retorna el pr�ximo trabajo a procesar. 
Adem�s, agregue en dicha clase los atributos nombre y lista que representan el nombre de la cola y 
si esta lista o no para retornar trabajos. Tenga presente, que cuando no existan trabajos en la cola o
cuando la misma no est� lista se debe lanzar las siguientes excepciones:
NoListaException y SinTrabajoEnColaException

A continuaci�n, se detalla cada una de las excepciones lanzadas por el m�todo sacar()de ColaDeTrabajo

public class NoListaException extends Exception {
private String nombre;
private long cantidadTrabajos;
public NoListaException (String nom, long s) {
nombre = nom;
cantidadTrabajos = s;
}
@Override
public String getMessage() {
return "La Cola de Trabajo: " + nombre + " no est�
disponible. Cantidad de trabajos a procesar : " +
cantidadTrabajos;
}
}
public class SinTrabajoEnColaException extends Exception {
private String nombre;
public SinTrabajoEnColaException (String nom) {
nombre = nom;
}
@Override
public String getMessage() {
return "La cola " + nombre + " no tiene trabajos para
procesar. ";
}
}

Se pide:
a) Implementar la clase ColaDeTrabajo y definir el m�todo sacar() en dicha clase.
b) �C�mo se lanzan las excepciones anteriores dentro del m�todo?
c) �C�mo se captura las excepciones al llamar al m�todo sacar()?

 */


public class Main {

	public static void main(String[] args) {
		ColaDeTrabajo ct = new ColaDeTrabajo("Cola1", true);
		ct.poner(new Trabajo(){
			@Override
			public void ejecutar() {
				// TODO Auto-generated method stub
				
			}
		});
		
		try {
			ct.sacar();
		} catch (NoListaException e) {
			e.getMessage();
		} catch (SinTrabajoEnColaException e) {
			e.getMessage();
		}
	}
}

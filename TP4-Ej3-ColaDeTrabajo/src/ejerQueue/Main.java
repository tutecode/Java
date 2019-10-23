package ejerQueue;


/*
Cree la clase ColaDeTrabajo que permita encolar diversos trabajos. 
O sea, los trabajos a encolar deben implementar la interfaz Trabajo.
Defina en la clase ColaDeTrabajo un método sacar() que retorna el próximo trabajo a procesar. 
Además, agregue en dicha clase los atributos nombre y lista que representan el nombre de la cola y 
si esta lista o no para retornar trabajos. Tenga presente, que cuando no existan trabajos en la cola o
cuando la misma no esté lista se debe lanzar las siguientes excepciones:
NoListaException y SinTrabajoEnColaException

A continuación, se detalla cada una de las excepciones lanzadas por el método sacar()de ColaDeTrabajo

public class NoListaException extends Exception {
private String nombre;
private long cantidadTrabajos;
public NoListaException (String nom, long s) {
nombre = nom;
cantidadTrabajos = s;
}
@Override
public String getMessage() {
return "La Cola de Trabajo: " + nombre + " no está
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
a) Implementar la clase ColaDeTrabajo y definir el método sacar() en dicha clase.
b) ¿Cómo se lanzan las excepciones anteriores dentro del método?
c) ¿Cómo se captura las excepciones al llamar al método sacar()?

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

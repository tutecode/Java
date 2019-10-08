package ejerReloj;

/*
 * Un reloj tiene un display que muestra la temperatura actual basándose en un sensor interno de dicho reloj. 
 * Esto quiere decir, que el display del reloj debe estar consultando por ejemplo 
 * cada 30 segundos el valor actual del sensor para mostrarlo. 
 * Puede que funcione, pero no es lo adecuado.
 * 
 * Mejor es que el sensor notifique al display al haber un cambio de temperatura y este lo muestre. 
 * Si no cambia la temperatura en 10 minutos no hay necesidad que el display consulte cada 30 segundos al sensor.
 * 
 * Pues la idea del patrón Observador es esta. 
 * Un Subject, en este caso el sensor, y uno o varios Observers como el display del reloj. 
 * Los observers deben registrarse con el subject, esto es como una especie suscripción. 
 * Así como cuando nos suscribimos a un servicio este le envía la notificaciones a todos sus suscriptores.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
	    Sensor s = new Sensor();

	    s.addObserver(d);

	    s.setValue(50);
	}
}

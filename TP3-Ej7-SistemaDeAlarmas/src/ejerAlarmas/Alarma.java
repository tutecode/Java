package ejerAlarmas;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Alarma implements Observer {
	
	private List<Sensor> sensores = new ArrayList<Sensor>();
	
	private List<Historial> historiales = new ArrayList<Historial>();
	

	public void addSensor(Sensor s) {
		sensores.add(s);
		
		s.addObserver(this);
	}
	
	public void activar() {
		for(Sensor s: sensores) {
			s.activar();
		}
	}
	
	public void desactivar() {
		for(Sensor s: sensores) {
			s.desactivar();
		}
	}
	
	public void update(Observable o, Object arg) {
		Sensor s = (Sensor) o;
		historiales.add(new Historial(s,
				GregorianCalendar.getInstance().getTime()));
		s.activar();
	}
	
	

}
package ejerAuto;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable {

	private ArrayList<Observador> observadores;
	
	public Acelerador() {
		observadores = new ArrayList<Observador>();
	}
	
	public void pisarAcelerador() {
		//vas a subir la potencia del motor
		notificar();
	}
	
	public void enlazarObservador(Observador o) {
		observadores.add(o);
	}
	
	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for (Observador o : observadores){
			o.update();
		}
	}

	
}

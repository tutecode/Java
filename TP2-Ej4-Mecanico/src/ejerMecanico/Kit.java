package ejerMecanico;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Pieza {
	private List<Pieza>piezas = new ArrayList<Pieza>();

	public Kit(List<Pieza> piezas) {
		super();
		this.piezas = piezas;
	}

	public float precio() {
		float total = 0;
		
		for(Pieza pieza : piezas) {
			total += pieza.precio();
		}
		
		return (float) (total * 0.9);
	}
	
	public int piezas() {
		int total = 0;
		
		for(Pieza pieza : piezas) {
			total += pieza.piezas();
		}
		
		return total;
	}
}

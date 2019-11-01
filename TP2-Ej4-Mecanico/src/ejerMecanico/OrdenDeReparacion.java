package ejerMecanico;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeReparacion {
	private List<Pieza> piezas = new ArrayList<Pieza>();

	public OrdenDeReparacion(List<Pieza> piezas) {
		super();
		this.piezas = piezas;
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}
	
	public float costo() {
		float total = 0;
		
		for(Pieza pieza : piezas) {
			total += pieza.precio();
		}
		
		return total;
	}
	
	public int totalPiezas() {
		int total = 0;
		
		for(Pieza pieza : piezas) {
			total += pieza.piezas();
		}
		
		return total;
	}
}

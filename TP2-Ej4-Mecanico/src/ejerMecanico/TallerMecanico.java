package ejerMecanico;

import java.util.ArrayList;
import java.util.List;

public class TallerMecanico {
	private List<OrdenDeReparacion> reparaciones = new ArrayList<OrdenDeReparacion>();

	public TallerMecanico(List<OrdenDeReparacion> reparaciones) {
		super();
		this.reparaciones = reparaciones;
	}
	
	public float costoTotal() {
		float costo = 0;
		
		for(OrdenDeReparacion orden : reparaciones) {
			costo += orden.costo();
		}
		
		return costo;
	}
	
	public int cantidadPiezasSimples() {
		int total = 0;
		
		for(OrdenDeReparacion orden : reparaciones) {
			total += orden.totalPiezas();
		}
		
		return total;
	}
	
	public float costoReparacion(OrdenDeReparacion reparacion) {
		return reparacion.costo();
	}
}

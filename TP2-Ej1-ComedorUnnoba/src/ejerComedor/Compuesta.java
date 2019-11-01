package ejerComedor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compuesta extends Reserva {
	private List<Plato> platos = new ArrayList<Plato>();

	public Compuesta(List<Plato> platos, Cliente cliente, Date fecha) {
		super();
		this.platos = platos;
		setCliente(cliente);
		setFecha(fecha);
	}

	public Compuesta(List<Plato> platos) {
		super();
		this.platos = platos;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
	
	public float valor() {
		float total = 0;
		
		for(Plato plato : platos) {
			total += getCliente().descuento(plato.getPrecio());
		}
		
		return (float) (total * 0.95);
	}
	
	public int totalPlatos() {
		return platos.size();
	}
}

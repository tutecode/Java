package ejerComedor;

import java.util.Date;

public class Simple extends Reserva {
	private Plato plato;
	
	public Simple(Cliente cliente, Plato plato, Date fecha) {
		super();
		this.plato = plato;
		setCliente(cliente);
		setFecha(fecha);
	}

	public float valor() {
		return getCliente().descuento(plato.getPrecio());
	}
	
	public int totalPlatos() {
		return 1;
	}
}

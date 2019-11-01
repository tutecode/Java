package ejerComedor;

import java.util.Date;

public abstract class Reserva {
	private Cliente cliente;
	private Date fecha;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public abstract float valor();
	
	public abstract int totalPlatos();
}

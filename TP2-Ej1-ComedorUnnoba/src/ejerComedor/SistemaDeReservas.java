package ejerComedor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaDeReservas {
	private List<Reserva> reservas = new ArrayList<Reserva>();

	public SistemaDeReservas(List<Reserva> reservas) {
		super();
		this.reservas = reservas;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public void agregarReserva(Cliente cliente, Plato plato, Date fecha) {
		reservas.add(new Simple(cliente, plato, fecha));
	}
	
	public void agregarReserva(Cliente cliente, List<Plato> platos, Date fecha) {
		reservas.add(new Compuesta(platos, cliente, fecha));
	}
	
	public float valorReserva(Reserva reserva) {
		return reserva.valor();
	}
	
	public float totalPlatosResevados() {
		int total = 0;
		
		for(Reserva reserva : reservas) {
			total += reserva.totalPlatos();
		}
		
		return total;
	}
	
	public float totalValorReservas() {
		float total = 0;
		
		for(Reserva reserva : reservas) {
			total += reserva.valor();
		}
		
		return total;
	}
	
	public Reserva reservaMasPlatos() {
		Reserva r = reservas.get(0);
		
		for(Reserva reserva : reservas) {
			if(reserva.totalPlatos() > r.totalPlatos()) {
				r = reserva;
			}
		}
		
		return r;
	}
	 
}
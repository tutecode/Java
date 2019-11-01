package ejerComedor;

public class Profesor extends Cliente {
	public Profesor() {
		setDescuento((float) 0.9);
	}
	
	public Profesor(float descuento) {
		setDescuento(descuento);
	}
	
	public float descuento(float valor) {
		return valor * getDescuento();
	}
}
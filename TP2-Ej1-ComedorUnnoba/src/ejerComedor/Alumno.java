package ejerComedor;

public class Alumno extends Cliente {
	public Alumno() {
		setDescuento((float) 0.8);
	}
	
	public Alumno(float descuento) {
		setDescuento(descuento);
	}
	
	public float descuento(float valor) {
		return valor * getDescuento();
	}
}

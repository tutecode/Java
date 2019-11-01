package ejerComedor;

public class Particular extends Cliente {
	public Particular() {
		setDescuento(1);
	}
	
	public Particular(float descuento) {
		setDescuento(descuento);
	}
	
	public float descuento(float valor) {
		return valor * getDescuento();
	}
}

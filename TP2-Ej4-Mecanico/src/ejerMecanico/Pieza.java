package ejerMecanico;

public abstract class Pieza {
	private String nombre;
	private int numero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract float precio();
	
	public abstract int piezas();
}

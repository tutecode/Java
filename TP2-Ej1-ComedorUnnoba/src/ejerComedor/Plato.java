package ejerComedor;

public class Plato {
	private String nombre;
	private float precio;
	private String dia;
	
	public Plato(String nombre, float precio, String dia) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.dia = dia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}

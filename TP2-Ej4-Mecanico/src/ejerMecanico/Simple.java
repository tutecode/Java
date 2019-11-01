package ejerMecanico;

public class Simple extends Pieza {
	private float precio;
	private float tiempo;
	
	public Simple(float precio, float tiempo) {
		super();
		this.precio = precio;
		this.tiempo = tiempo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}
	
	public float precio() {
		return precio;
	}
	
	public int piezas() {
		return 1;
	}
}

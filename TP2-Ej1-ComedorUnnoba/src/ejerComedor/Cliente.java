package ejerComedor;

public abstract class Cliente {
	private float descuento;

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public abstract float descuento(float valor);
}

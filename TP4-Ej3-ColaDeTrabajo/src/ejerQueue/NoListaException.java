package ejerQueue;

public class NoListaException extends Exception{
	private String nombre;
	private long cantidadTrabajos;
	
	public NoListaException (String nom, long s) {
		nombre = nom;
		cantidadTrabajos = s;
	}
	
	@Override
	public String getMessage() {
		return "La Cola de Trabajo: " + nombre + " no está disponible. "
				+ "Cantidad de trabajos a procesar: " + cantidadTrabajos;
	}

}

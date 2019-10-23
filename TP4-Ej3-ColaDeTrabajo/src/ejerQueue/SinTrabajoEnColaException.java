package ejerQueue;

public class SinTrabajoEnColaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	
	public SinTrabajoEnColaException (String nom) {
		nombre = nom;
	}
	
	@Override
	public String getMessage() {
		return "La cola " + nombre + " no tiene trabajos para procesar. ";
	}

}

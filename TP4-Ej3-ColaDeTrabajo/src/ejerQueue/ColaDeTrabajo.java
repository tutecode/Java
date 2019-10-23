package ejerQueue;


import java.util.Queue;
import java.util.LinkedList;

public class ColaDeTrabajo {

	private Queue<Trabajo> colas = new LinkedList<Trabajo>();
	
	private String nombre;
	private boolean lista;
	
	public ColaDeTrabajo(String nombre, boolean lista) {
		this.nombre = nombre;
		this.lista = lista;
	}

	public boolean isLista() {
		return lista;
	}
	public void setLista(boolean lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {
		if(!isLista())
			throw new NoListaException(getNombre(), colas.size());
		else if (colas.size() == 0)
			throw new SinTrabajoEnColaException(getNombre());
		else
			return colas.poll();
	}
	
	public void poner(Trabajo t) {
		colas.add(t);	
	}
	
	
}

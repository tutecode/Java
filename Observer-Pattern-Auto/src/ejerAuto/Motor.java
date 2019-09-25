package ejerAuto;

public class Motor implements Observador{

	public Motor() {}
	
	@Override
	public void update() {
		//accion a realizar despues de que se entera que el acelerador...
		System.out.println("Subir la potencia, subir velocidad/revoluciones, etc...");
	}

}

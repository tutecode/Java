package ejerAuto;

//https://www.youtube.com/watch?v=Zt6478Za0zk

public class Main {
	public static void main(String[] args) {
		
		//Motor es observador
		//Acelerador es observado (sujetoObservable)
	
		Motor v8 = new Motor();
		Acelerador x = new Acelerador();
		x.enlazarObservador(v8);
		x.pisarAcelerador();
	}
}

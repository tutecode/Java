package ejerTryCatch;

/*
Dado el siguiente método:

	public int dividir (int a, int b){
		return a/b;
	}
	
a) Realice pruebas con diferentes valores de a y de b.

b) ¿Qué pasa cuando b es 0? => Exception in thread "main" java.lang.ArithmeticException: / by zero

c) Modifique el método para que ahora cuando b sea 0, el valor de retorno sea 0.

d) ¿Cuál sería la excepción más adecuada para utilizar en este caso?

Nota: en el ejercicio d) debe capturar la excepción con un try - catch
 */

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 0;
		
		//System.out.println("El resultado es: " + dividir(a,b));
		
		//Modifique el método para que ahora cuando b sea 0, el valor de retorno sea 0.
		
		int c = 0;
		
		try {
            c = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Nothing to worry.\n"
                    + "We are just printing the stack trace.\n"
                    + "ArithmeticException is handled. But take care of the variable \"c\"");
        }
        
		System.out.println("Value of c : "+ c);
		
	}
	
	public static int dividir (int a, int b){
		return a/b;
	}
}

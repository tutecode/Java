package ejerTryCatch;

/*
Dado el siguiente m�todo:

	public int dividir (int a, int b){
		return a/b;
	}
	
a) Realice pruebas con diferentes valores de a y de b.

b) �Qu� pasa cuando b es 0? => Exception in thread "main" java.lang.ArithmeticException: / by zero

c) Modifique el m�todo para que ahora cuando b sea 0, el valor de retorno sea 0.

d) �Cu�l ser�a la excepci�n m�s adecuada para utilizar en este caso?

Nota: en el ejercicio d) debe capturar la excepci�n con un try - catch
 */

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 0;
		
		//System.out.println("El resultado es: " + dividir(a,b));
		
		//Modifique el m�todo para que ahora cuando b sea 0, el valor de retorno sea 0.
		
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

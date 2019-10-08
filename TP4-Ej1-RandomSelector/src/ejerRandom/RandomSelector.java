package ejerRandom;

import java.util.ArrayList;
import java.util.Random;

/*
 * En java, cuando se define una nueva clase, se debe conocer el tipo de datos con el que se trabajar�. 
 * Pero en este caso necesitamos que sea independiente al tipo de datos, 
 * y as� poder reutilizar la clase sin necesidad de hacer alteraciones al c�digo.
 * Es aqu� donde entra el concepto de tipos gen�ricos.
 * 
 * La utilizaci�n seria:
 * 
 */

public class RandomSelector<T>{
	
	/* T es un tipo gen�rico que ser� sustituido por el tipo real cuando se instancie la clase.
	 * Al RandomSelector se le pod�a agregar N objetos, 
	 * vamos a necesitar hacer uso de alguna colecci�n para ir guardando los objetos.
	 */

	private ArrayList<T> elementos;
    private Random rn;
    
    public RandomSelector() {
            this.elementos = new ArrayList<T>();
            this.rn = new Random();
    }
    
    /* Ver�n como a la colecci�n se le da como tipo de datos a T, el tipo gen�rico.
     * rn es de tipo Random, y nos va servir m�s adelante para la aleatoriedad.
     * Agregamos el m�todo agregarElemento que recibe como par�metro un objeto de tipo T y lo agrega a la colecci�n.
     */
    
    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
    }
    
    /* Por otro lado, el m�todo selectNext retorna un elemento de tipo T, 
     * y que es el que se ubica en la posici�n 'x' de la colecci�n elementos. 
     * Dichas posici�n 'x' se obtiene con un numero aleatorio que va desde 0 al tama�o de la colecci�n - 1
     */
    
    public T selectNext() {
        return this.elementos.get(rn.nextInt(this.elementos.size()));
    }
    
    /* Usamos un primer objeto RandomSelector con T = String y uno segundo con T = Integer. 
     * Y funcion� de igual manera sin importar el tipo
		Por �ltimo existen una serie de convenciones para nombrar a los gen�ricos:
			E � Element (usado bastante por Java Collections)
			N � Number (para n�meros)
			K � Key (Llave, usado en mapas)
			T � Type (Representa un tipo, es decir, una clase)
			V � Value (representa el valor, tambi�n se usa en mapas)
     */
}

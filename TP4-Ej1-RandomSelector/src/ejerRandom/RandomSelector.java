package ejerRandom;

import java.util.ArrayList;
import java.util.Random;

/*
 * En java, cuando se define una nueva clase, se debe conocer el tipo de datos con el que se trabajará. 
 * Pero en este caso necesitamos que sea independiente al tipo de datos, 
 * y así poder reutilizar la clase sin necesidad de hacer alteraciones al código.
 * Es aquí donde entra el concepto de tipos genéricos.
 * 
 * La utilización seria:
 * 
 */

public class RandomSelector<T>{
	
	/* T es un tipo genérico que será sustituido por el tipo real cuando se instancie la clase.
	 * Al RandomSelector se le podía agregar N objetos, 
	 * vamos a necesitar hacer uso de alguna colección para ir guardando los objetos.
	 */

	private ArrayList<T> elementos;
    private Random rn;
    
    public RandomSelector() {
            this.elementos = new ArrayList<T>();
            this.rn = new Random();
    }
    
    /* Verán como a la colección se le da como tipo de datos a T, el tipo genérico.
     * rn es de tipo Random, y nos va servir más adelante para la aleatoriedad.
     * Agregamos el método agregarElemento que recibe como parámetro un objeto de tipo T y lo agrega a la colección.
     */
    
    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
    }
    
    /* Por otro lado, el método selectNext retorna un elemento de tipo T, 
     * y que es el que se ubica en la posición 'x' de la colección elementos. 
     * Dichas posición 'x' se obtiene con un numero aleatorio que va desde 0 al tamaño de la colección - 1
     */
    
    public T selectNext() {
        return this.elementos.get(rn.nextInt(this.elementos.size()));
    }
    
    /* Usamos un primer objeto RandomSelector con T = String y uno segundo con T = Integer. 
     * Y funcionó de igual manera sin importar el tipo
		Por último existen una serie de convenciones para nombrar a los genéricos:
			E – Element (usado bastante por Java Collections)
			N – Number (para números)
			K – Key (Llave, usado en mapas)
			T – Type (Representa un tipo, es decir, una clase)
			V – Value (representa el valor, también se usa en mapas)
     */
}

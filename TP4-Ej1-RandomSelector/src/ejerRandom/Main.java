package ejerRandom;

/*
Una f�brica de juegos de PC desea modelar un sistema de selecci�n aleatoria de
Jugadores (RandomSelector). Dado que la selecci�n aleatoria se usa en muchos y
variados juegos (p.e: selecci�n aleatoria de n�meros, de cartas, de colores, de fichas,
etc.) se detall� que el RandomSelector deber�a ser dise�ado de tal forma que se pueda
usar con cualquier tipo de objetos.

Nota: El funcionamiento deber�a ser el siguiente: Una vez creado el RandomSelector
con el tipo de Objeto que va a seleccionar este permanece as�. Al RandomSelector se le
pueden agregar N objetos a seleccionar. Cuando se le dice selectNext() retorna un
objeto seleccionado de manera aleatoria.
 */

public class Main {
	public static void main(String[] args) {
        RandomSelector<String> rS1 = new RandomSelector<String>();
        rS1.agregarElemento("Piedra");
        rS1.agregarElemento("Papel");
        rS1.agregarElemento("Tijera");
        System.out.println(rS1.selectNext());
                
        RandomSelector<Integer> rS2 = new RandomSelector<Integer>();
        rS2.agregarElemento(1);
        rS2.agregarElemento(2);
        rS2.agregarElemento(3);
        System.out.println(rS2.selectNext());
     }
}

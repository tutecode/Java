package ejerRandom;

/*
Una fábrica de juegos de PC desea modelar un sistema de selección aleatoria de
Jugadores (RandomSelector). Dado que la selección aleatoria se usa en muchos y
variados juegos (p.e: selección aleatoria de números, de cartas, de colores, de fichas,
etc.) se detalló que el RandomSelector debería ser diseñado de tal forma que se pueda
usar con cualquier tipo de objetos.

Nota: El funcionamiento debería ser el siguiente: Una vez creado el RandomSelector
con el tipo de Objeto que va a seleccionar este permanece así. Al RandomSelector se le
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

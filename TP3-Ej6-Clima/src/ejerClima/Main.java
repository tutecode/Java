package ejerClima;

/*
Utilizando el ejercicio 6 del trabajo práctico 1 (el ejercicio del clima) se desea modelar
una estación meteorológica. La misma maneja el clima actual de una ciudad
determinada. Cuando la estación se crea se define la ciudad y esta no se puede cambiar.
El clima actual es un objeto clima del Tp1Ej6.

Además del clima actual la estación guarda un historial de todos los climas. La estación
meteorológica actualiza el clima actual de la ciudad cada 15 minutos de manera
automática (no se debe modelar o hacer métodos especiales para esto por ahora). Esto
significa que se crea un nuevo objeto clima, el cual pasa a ser el clima actual, con los
valores correspondientes y el clima anterior pasa al historial.

La estación meteorológica debe (al menos) tener la siguiente funcionalidad:

● public Clima climaActual() //El cual retorna el clima actual
● public void agregarClima(Clima unClima) //Agrega unClima al historial
● public void eliminarClima(Clima unClima) //Elimina unClima del historial
● public List<Clima> getClimas()//Retorna todos los climas del historial
● public void ordenarClimaPorFecha() //Ordena el historial por fecha
● public void ordenarClimaTemperatura()//Ordena el historial por temperatura. 
										Sin tener en cuenta la escala. Solo se ordena por el
										valor de la temperatura.

 */

public class Main {
	public static void main(String[] args){
        RandomSelector<String> rs= new RandomSelector<String>();
        
        rs.add("Fede");
        rs.add("Hola");
        rs.add("Mundo");
        rs.add("Sol");
        
        for (int x=1; x<10; x++)
            System.out.println(rs.selectNext());
    }
}

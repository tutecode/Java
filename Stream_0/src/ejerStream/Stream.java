package ejerStream;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	private List<String> lista;
	private List<String> numeros;
	
	//Constructor
	public Stream() {
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("MitoCode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	//Metodos
	
	public void filtrar() {
		//Filtrar la lista todos los que empiezan con 'M' y luego imprimirlos
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
	}
	
	public void ordenar() {
		//Ordena la lista de manera ordenada
		//lista.stream().sorted().forEach(System.out::println);
		//Ordena la lista segun  la coordenada 'y' osea al reves
		lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar() {
		//Transformar la expresion uno a uno a 'toUpperCase'
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//Transformar cada elemento 'String' a 'Int' y sumarle 1 unidad
		/*for(String x : numeros) {
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}*/
		
		
		//Stream: Transformar cada elemento 'String' a 'Int' y sumarle 1 unidad
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar() {
		//Limitar hasta '2' elementos de la lista
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		//Contar elementos de la lista
		long x = lista.stream().count();
		System.out.println(x);
	}
	

}

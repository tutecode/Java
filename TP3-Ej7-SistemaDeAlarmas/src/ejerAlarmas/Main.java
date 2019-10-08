package ejerAlarmas;

/*
Un sistema de alarmas está compuesto por una central y varios sensores. Los sensores
pueden ser sensores de movimiento o de contacto (comúnmente los que se instalan en
las puertas y ventanas).
Los sensores pueden estar en tres estados posibles:
1- Apagado: el sensor está fuera de uso y no registra cambios
2- Esperando: el sensor está esperando algún cambio
3- Alerta: se produjo una alerta. (p.e. un sensor de movimiento detectó un
movimiento)
Cada vez que los sensores registran, o pasan al estado de alerta, deben informar dicho
suceso a la central. Los mismos quedan en dicho estado hasta que la central indique lo
contrario.
Cuando la central se activa, ésta debe activar cada uno de los sensores y ponerlos en
estado Esperando. Cuando la central se desactiva, esta debe activar cada uno de los
sensores y ponerlos en estado Apagado. Asimismo, la central puede pasar un sensor (o
varios) del estado de Alerta al estado de Esperando.
Cada vez que se produce una alerta por medio sensor (no importa cuál), la central
registra ese cambio en un historial. Tenga en cuenta cuáles serían los datos necesarios
para determinar cuál sensor fue activado, en qué fecha, etc.
● Realice en UML un diagrama de clases de la solución.
● Indique qué patrón o patrones utilizo y donde.
● Implemente en JAVA-Like.
Nota: tenga en cuenta que se pueden agregar nuevos sensores de diferentes tipos a la
central y esto no debería afectar el funcionamiento de la misma.
Nota 2: se debe utilizar el mecanismo de Observer/Observable que implementa
 */

public class Main {
	public static void main(String[] args) {
		Alarma a = new Alarma();
		
		Sensor s1= new Sensor();
		
		a.addSensor(s1);
		
		a.activar();
		
		s1.movimiento();
		
		a.desactivar();
	}
}

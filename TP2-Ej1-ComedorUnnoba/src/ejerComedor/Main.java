package ejerComedor;

/*
El comedor universitario de la UNNOBA nos solicita la creación de un sistema de
reservas de los platos del día. Es decir que los platos del día solo se manejan por reserva
anticipada.

Del plato del día se conoce su nombre (por ejemplo: arroz con pollo), su precio (todos
los platos tienen diferentes precios) y el día de la semana en el que estará disponible.
(Por ejemplo: los lunes hay arroz con pollo, los martes milanesa con puré, etc., etc.).

De la reserva se conoce el cliente, la fecha y el plato reservado donde las reservas
pueden ser de un solo plato del día o de más de un plato (Sin límite). 

Se puede dar el caso que un cliente reserve todos los platos de la semana, de la quincena, del mes.

En el caso de que las reservas sean de más de un plato se realiza un descuento del 5% sobre la suma de todos los platos.

Además, lo clientes pueden ser alumnos, profesores o particulares. 
En el caso de que la reserva sea para un alumno, el precio del plato del día tendrá un descuento del 20%, 
en cambio, si la reserva la realiza un profesor el plato tiene un descuento del 10% y 
si la realiza un particular la misma no posee descuento.

Del comedor se conoce las reservas, la dirección y el teléfono del mismo.

Nota: el plato del día hace referencia a la opción de comida de ese día

a) Agrega una reserva a las reservas del comedor
	public void agregarReserva(Cliente cliente, Plato plato)
	
b) Agrega varias reservas a las reservas del comedor
	public void agregarReserva(Cliente cliente, Vector<Plato> platos)
	
c) Retorna el valor del plato teniendo en cuenta los descuentos pertinentes
	public float valorReserva(Reserva reserva)
	
d) Retorna la cantidad total de todos los platos reservados 
	public int totalPlatosReservados()
	
e) Retorna la suma total de todos los valores platos reservados 
	public float totalValorReservas()
	
f) Retorna la reserva que tenga más platos reservados 
	public Reserva reservaMasPlatos()

 */

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

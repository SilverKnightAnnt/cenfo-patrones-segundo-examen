package com.renta.peliculas;

import java.util.HashMap;

public class Registrar {
	
	private static HashMap Peliculas = new HashMap();
	private static HashMap Clientes = new HashMap();

	/*
	 * En este caso se está realizando un 'if' para verificar si lo que viene es una
	 * Pelicula y por ende devolver cierta película o en el caso contrario devolver
	 * un cliente, pero, que pasaría si ahora se tendría que manejar otros objetos
	 * aparte de estos? habría que hacer tantos 'else' como condiciones tenga el
	 * programa, lo cual no es una buena práctica puesto que habría que modificar
	 * este código siempre que se necesite
	 */	

	/*
	 * Por ende, una solución a este problema es el uso del patrón estrategia para
	 * así evitar el uso excesivo de los 'ifs'
	 */
	public static Object get(String coleccion, String nombre) {
		if ("Peliculas".equals(coleccion)){
			return Peliculas.get(nombre);
		}
		return Clientes.get(nombre);
	}
	
	// Misma situación del método anterior.
	public static void add(String coleccion, Object objeto) {
		if ("Peliculas".equals(coleccion)){
			Pelicula nuevaPelicula = (Pelicula) objeto;
			Peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula);
		}
		Cliente nuevoCliente = (Cliente) objeto;
		Clientes.put(nuevoCliente.getNombre(), nuevoCliente);
	}

}

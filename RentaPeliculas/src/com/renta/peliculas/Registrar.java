package com.renta.peliculas;

import java.util.HashMap;

public class Registrar {
	
	private static HashMap Peliculas = new HashMap();
	private static HashMap Clientes = new HashMap();

	/*
	 * En este caso se est� realizando un 'if' para verificar si lo que viene es una
	 * Pelicula y por ende devolver cierta pel�cula o en el caso contrario devolver
	 * un cliente, pero, que pasar�a si ahora se tendr�a que manejar otros objetos
	 * aparte de estos? habr�a que hacer tantos 'else' como condiciones tenga el
	 * programa, lo cual no es una buena pr�ctica puesto que habr�a que modificar
	 * este c�digo siempre que se necesite
	 */	

	/*
	 * Por ende, una soluci�n a este problema es el uso del patr�n estrategia para
	 * as� evitar el uso excesivo de los 'ifs'
	 */
	public static Object get(String coleccion, String nombre) {
		if ("Peliculas".equals(coleccion)){
			return Peliculas.get(nombre);
		}
		return Clientes.get(nombre);
	}
	
	// Misma situaci�n del m�todo anterior.
	public static void add(String coleccion, Object objeto) {
		if ("Peliculas".equals(coleccion)){
			Pelicula nuevaPelicula = (Pelicula) objeto;
			Peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula);
		}
		Cliente nuevoCliente = (Cliente) objeto;
		Clientes.put(nuevoCliente.getNombre(), nuevoCliente);
	}

}

package com.renta.peliculas;

import java.util.HashMap;

/*Ahora esta clase solo maneja la persistencia de las pel�culas 
y por ende no hace falta que reciba una colecci�n.*/

public class PersistenciaPeliculas implements Registrar {

	private static HashMap Peliculas = new HashMap();

	// Como ahora solo se manejan pel�culas, este m�todo puede devolver de una vez
	// la pel�cula
	@Override
	public Pelicula get(String nombre) {
		return (Pelicula) Peliculas.get(nombre);
	}

	@Override
	public void add(Object objeto) {
		Pelicula nuevaPelicula = (Pelicula) objeto;
		Peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula);
	}
}

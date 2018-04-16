package com.renta.peliculas;

import java.util.HashMap;

public class PersistenciaPeliculas implements Registrar {

	private static HashMap Peliculas = new HashMap();
	
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

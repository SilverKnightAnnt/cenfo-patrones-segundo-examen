package com.renta.peliculas;

public class Pelicula {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int ESTRENO = 1;

	private String nombre;
	private int codigoPrecio;

	public Pelicula(String pNombre, int pCodigoPrecio) {
		this.setNombre(pNombre);
		this.setCodigoPrecio(pCodigoPrecio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPrecio() {
		return codigoPrecio;
	}

	public void setCodigoPrecio(int codigoPrecio) {
		this.codigoPrecio = codigoPrecio;
	}

	public void persist() {
		Registrar.add("Movies", this);
	}

	public static Pelicula get(String name) {
		return (Pelicula) Registrar.get("Peliculas", name);
	}
	// Yo manejaría lo que son gets y sets en una misma sección del código
	// para evitar confusiones dentro de este
	/*
	 * public String getNombre() { return nombre; }
	 * 
	 * public void setNombre(String nombre) { this.nombre = nombre; }
	 */
}

package com.renta.peliculas;

public interface Registrar {

	/*
	 * Como se aplica estrategia ya no es necesario enviarle la colecci�n, puesto
	 * que ahora solo se instancia a la persistencia requerida que contienen el
	 * encapsulamiento de la l�gica de las persistencias.
	 */
	public Object get(String nombre);

	public void add(Object objeto);
}

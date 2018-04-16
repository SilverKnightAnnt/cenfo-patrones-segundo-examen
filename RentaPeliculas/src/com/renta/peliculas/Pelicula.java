package com.renta.peliculas;

public class Pelicula {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int ESTRENO = 1;

	private String nombre;
	private int codigoPrecio;

	public Pelicula() {
		
	}
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

		PersistenciaPeliculas pp = FabricaRentas.crearPersistenciaPeliculas();				
		pp.add(this);
	}

	public static Pelicula get(String name) {
		
		PersistenciaPeliculas pp = FabricaRentas.crearPersistenciaPeliculas();
		return pp.get(name);

	}
}

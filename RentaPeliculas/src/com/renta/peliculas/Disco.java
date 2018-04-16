package com.renta.peliculas;

public class Disco {

	private String numeroSerie;
	private Pelicula pelicula;

	public Disco() {
		
	}
	public Disco(String pNumeroSerie, Pelicula pPelicula) {
		this.numeroSerie = pNumeroSerie;
		this.pelicula = pPelicula;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}

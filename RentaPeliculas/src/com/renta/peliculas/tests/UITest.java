package com.renta.peliculas.tests;

import org.junit.Test;

import com.renta.peliculas.Alquiler;
import com.renta.peliculas.Cliente;
import com.renta.peliculas.Disco;
import com.renta.peliculas.ManejoAlquileres;
import com.renta.peliculas.Pelicula;

public class UITest {

	@Test
	public void realizarAlquiler() {
		ManejoAlquileres ma = new ManejoAlquileres();
		Pelicula pelicula = new Pelicula("Harry Potter", 2);
		Disco disco = new Disco("E-231", pelicula);
		Alquiler alquiler = new Alquiler(disco,7);
		Cliente cliente = new Cliente("Danilo");		
		
		ma.addRental(alquiler);		
		
		ma.statement(cliente);
	}
	@Test
	public void realizarAlquilerDeDosPeliculas() {		
		ManejoAlquileres ma = new ManejoAlquileres();
		Pelicula pelicula = new Pelicula("Harry Potter", 2);
		Disco disco = new Disco("E-231", pelicula);
		Alquiler alquiler = new Alquiler(disco,7);
		Cliente cliente = new Cliente("Danilo");
		ma.addRental(alquiler);
		Pelicula pelicula2 = new Pelicula("El señor de los anillos", 1);
		Disco disco2 = new Disco("E-450", pelicula2);
		Alquiler alquiler2 = new Alquiler(disco2,4);
		ma.addRental(alquiler2);		
		
		System.out.println(ma.statement(cliente));
	}
	
	
}

package com.renta.peliculas.tests;

import org.junit.Test;

import com.renta.peliculas.Alquiler;
import com.renta.peliculas.Cliente;
import com.renta.peliculas.Disco;
import com.renta.peliculas.Pelicula;

public class UITest {

	@Test
	public void realizarAlquiler() {
		Pelicula pelicula = new Pelicula("Harry Potter", 2);
		Disco disco = new Disco("E-231", pelicula);
		Alquiler alquiler = new Alquiler(disco,7);
		Cliente cliente = new Cliente("Danilo");		
		
		cliente.addRental(alquiler);
		
		cliente.statement();
	}
	
	@Test
	public void realizarAlquilerDeDosPeliculas() {
		Pelicula pelicula = new Pelicula("Harry Potter", 2);
		Disco disco = new Disco("E-231", pelicula);
		Alquiler alquiler = new Alquiler(disco,7);
		Cliente cliente = new Cliente("Danilo");
		Pelicula pelicula2 = new Pelicula("El señor de los anillos", 1);
		Disco disco2 = new Disco("E-450", pelicula2);
		Alquiler alquiler2 = new Alquiler(disco2,4);
		
		cliente.addRental(alquiler);		
		cliente.addRental(alquiler2);
		
		cliente.statement();
	}
	
	
}

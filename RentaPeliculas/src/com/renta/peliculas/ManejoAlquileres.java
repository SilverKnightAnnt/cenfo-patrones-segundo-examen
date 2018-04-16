package com.renta.peliculas;

import java.util.ArrayList;
import java.util.Iterator;

public class ManejoAlquileres {

	private ArrayList<Alquiler> alquileres = new ArrayList<>();

	public void addRental(Alquiler arg) {
		alquileres.add(arg);
	}

	public String statement(Cliente cliente) {
		cliente.setAlquileres(alquileres);
		double montoTotal = 0;
		int puntosAlquilerFrecuente = 0;
		Iterator<Alquiler> iterator = alquileres.iterator();
		String result = "Alquileres de " + cliente.getNombre() + ":\n";
		while (iterator.hasNext()) {
			double montoAlquiler = 0;
			Alquiler alquiler = iterator.next();

			// Debido al gran tamaño del método, saqué la lógica del monto del alquiler
			// a un método aparte para acortar un poco el tamaño del código
			montoAlquiler = determinarMontoAlquiler(alquiler, montoAlquiler);

			montoTotal += montoAlquiler;

			puntosAlquilerFrecuente++;
			// agregar bono por alquiler de pelicula "estreno"
			if ((alquiler.getDisco().getPelicula().getCodigoPrecio() == Pelicula.ESTRENO)
					&& alquiler.getDiasAlquilado() > 1)
				puntosAlquilerFrecuente++;

			// mostrar datos
			result += "\t" + alquiler.getDisco().getPelicula().getNombre() + "\t" + String.valueOf(montoAlquiler)
					+ "\n";

		}
		// fin del reporte
		result += "Monto total:  " + String.valueOf(montoTotal) + "\n";
		result += "Gano " + String.valueOf(puntosAlquilerFrecuente) + " puntos por alquiler frecuente";
		return result;

	}

	public double determinarMontoAlquiler(Alquiler alquiler, double montoAlquiler) {

		// determine amounts for each line
		switch (alquiler.getDisco().getPelicula().getCodigoPrecio()) {
		case Pelicula.NORMAL:
			montoAlquiler += 2;
			if (alquiler.getDiasAlquilado() > 2)
				montoAlquiler += (alquiler.getDiasAlquilado() - 2) * 1.5;
			break;
		case Pelicula.ESTRENO:
			montoAlquiler += alquiler.getDiasAlquilado() * 3;
			break;
		case Pelicula.INFANTIL:
			montoAlquiler += 1.5;
			if (alquiler.getDiasAlquilado() > 3)
				montoAlquiler += (alquiler.getDiasAlquilado() - 3) * 1.5;
			break;
		}
		return montoAlquiler;
	}

}

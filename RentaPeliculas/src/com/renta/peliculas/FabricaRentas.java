package com.renta.peliculas;

import java.util.ArrayList;
import java.util.HashMap;

public class FabricaRentas {

	public static ArrayList crearArrayList() {
		return new ArrayList();
	}
	
	public static HashMap crearHashMap() {
		return new HashMap();
	}
	
	public static Pelicula crearPelicula() {
		return new Pelicula();
	}

	public static Disco crearDisco() {
		return new Disco();
	}

	public static Cliente crearCliente() {
		return new Cliente();
	}

	public static Alquiler crearAlquiler() {
		return new Alquiler();
	}

	public static ManejoAlquileres crearManejoAlquileres() {
		return new ManejoAlquileres();
	}

	public static PersistenciaClientes crearPersistenciaClientes() {
		return new PersistenciaClientes();
	}

	public static PersistenciaPeliculas crearPersistenciaPeliculas() {
		return new PersistenciaPeliculas();
	}
}
